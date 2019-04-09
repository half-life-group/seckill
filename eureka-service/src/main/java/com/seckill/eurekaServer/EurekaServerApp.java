package com.seckill.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableEurekaServer
@EnableScheduling
public class EurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp.class, args);
    }


//    @Scheduled(cron = "0/5 * * * * ?")
    public void test1(){
        try {
            Thread.sleep(5000);
            System.out.println("11111111111111111111");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    @Scheduled(cron = "0/5 * * * * ?")
    public void test2(){
        try {
            Thread.sleep(5000);
            System.out.println("2222222222222222222222222");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
