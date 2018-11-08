package com.qichunlei.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run( EurekaClientApplication.class, args );
    }


    @RequestMapping("/actuator/info")
    public String home(@RequestParam(value = "name", defaultValue = "qichunlei") String name) {
        return "Hi " + name + " ,I am from port:" + "8091";
    }

}
