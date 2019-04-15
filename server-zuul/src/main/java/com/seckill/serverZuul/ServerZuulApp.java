package com.seckill.serverZuul;

import com.seckill.serverZuul.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
//@EnableOAuth2Sso
public class ServerZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerZuulApp.class, args);
    }
    /**
     * 资源过滤器
     * @return 资源过滤器
     */
    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
