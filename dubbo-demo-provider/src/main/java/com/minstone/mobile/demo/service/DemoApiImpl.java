package com.minstone.mobile.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by Explorer_Bailey on 2017/8/22.
 */
@Service("demoApi")
public class DemoApiImpl implements IDemoApi{
    @Override
    public String sayHello() {
        return "Hello spring-boot gradle dubbo!";
    }
}
