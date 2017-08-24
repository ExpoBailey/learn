package com.minstone.mobile.test.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
//import com.minstone.mobile.demo.service.IDemoApi;

/**
 * <p><p>
 * <describe></describe>
 *
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/8/24 10:27
 * @Since jdk1.8
 * @Version 1.0.0
 */
@Service(version = "1.0.0")
public class TestApiImpl implements ITestApi{

//    @Reference(version = "1.0.0")
//    private IDemoApi demoApi;

    @Override
    public String sayHello() {
        return /*demoApi.sayHello() + */" Hi, I'm TestApiImpl";
    }
}
