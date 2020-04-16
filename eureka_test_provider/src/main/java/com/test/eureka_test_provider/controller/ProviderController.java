package com.test.eureka_test_provider.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Value("$server.port")
    private  Integer port;//获取该服务器的端口号

    //在生产者中创建一个接口，然后再消费者中消费这个接口
    @RequestMapping("/hello")
    public String hello(){
        return "hello------->port="+port;
    }

}
