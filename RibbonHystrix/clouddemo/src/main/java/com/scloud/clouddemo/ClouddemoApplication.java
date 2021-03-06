package com.scloud.clouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClouddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClouddemoApplication.class, args);
    }

}
