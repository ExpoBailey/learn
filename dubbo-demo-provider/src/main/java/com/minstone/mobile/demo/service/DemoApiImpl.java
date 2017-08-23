package com.minstone.mobile.demo.service;


import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by Explorer_Bailey on 2017/8/22.
 */
@Service(version = "1.0.0")
public class DemoApiImpl implements IDemoApi{
    @Override
    public String sayHello() {
        return "Hello spring-boot gradle dubbo!";
    }
}
