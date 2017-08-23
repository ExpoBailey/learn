package com.minstone.mobile.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.minstone.mobile.demo.service.IDemoApi;
import com.minstone.mobile.demo.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * <p><p>
 * <describe></describe>
 *
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/8/23 10:38
 * @Since jdk1.8
 * @Version 1.0.0
 */
@Service("demoService")
public class DemoServiceImpl implements IDemoService{

    @Reference(version = "1.0.0")
    private IDemoApi demoApi;

    @Override
    public String hello() {
        return demoApi.sayHello();
    }
}
