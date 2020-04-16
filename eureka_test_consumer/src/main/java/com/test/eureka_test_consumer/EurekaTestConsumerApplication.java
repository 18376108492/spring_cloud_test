package com.test.eureka_test_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaTestConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTestConsumerApplication.class, args);
    }

}
