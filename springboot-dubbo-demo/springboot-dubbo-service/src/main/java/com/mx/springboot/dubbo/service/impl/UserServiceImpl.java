package com.mx.springboot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mx.springboot.dubbo.service.UserService;
//import org.springframework.stereotype.Service;

@Service//@Service("userService")//pringboot整合dubbo提供的服务方的注解(如果是xml形式整合,该注解就是spring下面的;否则就是dubbo下面的)
public class UserServiceImpl implements UserService{

    @Override
    public String getName2(int id) {
        System.out.println("id=" + id);
        return "李四";
    }

    @Override
    public String getName(int id) {
        System.out.println("id=" + id);
        return "张三";
    }
}
