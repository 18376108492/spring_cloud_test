package com.test.eureka_test_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaTestProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTestProviderApplication.class, args);
    }

}
