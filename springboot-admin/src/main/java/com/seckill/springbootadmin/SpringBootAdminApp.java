package com.seckill.springbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableAutoConfiguration
@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApp.class, args);
    }
}
