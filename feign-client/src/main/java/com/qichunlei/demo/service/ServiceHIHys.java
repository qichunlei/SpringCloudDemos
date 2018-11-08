package com.qichunlei.demo.service;

import org.springframework.stereotype.Component;

/**
 * @Author: qichunlei
 * @Description:
 * @Date: Created in 15:08 2018/11/5/005
 * @Modified By:
 */
@Component
public class ServiceHIHys implements ServiceHI {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
