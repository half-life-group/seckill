package com.jack.feignClient.s;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixCommandProperties;
import feign.Feign;
import feign.Target;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.lang.reflect.Method;

@Configurable
public class DisableHystrixConfiguration {

    @Bean
    @Scope("prototype")
    public Feign.Builder feignHystrixBuilder() {
        return HystrixFeign.builder().setterFactory(new SetterFactory() {
                    @Override
                    public HystrixCommand.Setter create(Target<?> target, Method method) {
                        String groupKey = target.name();
                        System.out.println("groupKey:"+groupKey);
                        String commandKey = method.getName();
                        System.out.println("commandKey==" + commandKey);
                        int time = 100;
                        if ("queryCategoriesCodeByProductCode2".equals(commandKey)) {
                            time = 4000;
                        }
                        return HystrixCommand.Setter
                                .withGroupKey(HystrixCommandGroupKey.Factory.asKey(groupKey))
                                .andCommandKey(HystrixCommandKey.Factory.asKey(commandKey))
                                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(time));
                    }
                });
    }
}