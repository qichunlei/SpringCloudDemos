package com.qichunlei.demo.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: qichunlei
 * @Description:
 * @Date: Created in 13:28 2018/11/5/005
 * @Modified By:
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLINET/actuator/info?name="+name,String.class);
    }
}
