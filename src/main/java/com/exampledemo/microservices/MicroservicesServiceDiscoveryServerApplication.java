package com.exampledemo.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesServiceDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesServiceDiscoveryServerApplication.class, args);
    }

}
