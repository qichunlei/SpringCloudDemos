package com.qichunlei.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qichunlei
 * @Description:
 * @Date: Created in 12:08 2018/11/5/005
 * @Modified By:
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run( ConfigClientApplication.class, args );
    }

    @Value("${test}")
    String test;
    @RequestMapping(value = "/hi")
    public String hi(){
        return test;
    }
}
