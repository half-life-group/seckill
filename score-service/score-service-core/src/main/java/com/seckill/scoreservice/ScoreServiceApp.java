package com.seckill.scoreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ScoreServiceApp {
    // ceshi
    public static void main(String[] args) {
        SpringApplication.run(ScoreServiceApp.class, args);
    }
}
