package com.qichunlei.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: qichunlei
 * @Description:
 * @Date: Created in 14:27 2018/11/5/005
 * @Modified By:
 */
@FeignClient(value = "eureka-clinet",fallback = ServiceHIHys.class)
public interface ServiceHI {
    @RequestMapping(value = "/actuator/info",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
