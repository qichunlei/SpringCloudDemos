package com.qichunlei.demo.contorller;

import com.qichunlei.demo.service.ServiceHI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qichunlei
 * @Description:
 * @Date: Created in 14:29 2018/11/5/005
 * @Modified By:
 */
@RestController
public class HiContorller {
    @Autowired
    ServiceHI sayHiFromClientOne;
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return sayHiFromClientOne.sayHiFromClientOne( name );
    }
}
