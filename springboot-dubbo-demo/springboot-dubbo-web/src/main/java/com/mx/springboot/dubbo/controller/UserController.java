package com.mx.springboot.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mx.springboot.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference//这种方式是springboot整合dubbo提供的消费方的注解
    //@Autowired
    private UserService userService;

    @RequestMapping("/dubbo")
    public String testDubbo(){
        String name = userService.getName(1);
        //String name = userService.getName2(1);
        return name;
    }
}
