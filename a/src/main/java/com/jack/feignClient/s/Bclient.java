package com.jack.feignClient.s;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "b", fallback = BclientFailback.class, configuration = DisableHystrixConfiguration.class)
public interface Bclient {
    @RequestMapping(method = RequestMethod.POST, value = "/btest")
    String get(@RequestBody String s);

    @RequestMapping(method = RequestMethod.POST, value = "/btest01")
    String get01(@RequestBody String s);

    @HystrixCommand(fallbackMethod = "fallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000" )
    })
    @GetMapping(value = "/03")
    String get03();

}
