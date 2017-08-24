package com.minstone.mobile.demo.controller;

import com.minstone.mobile.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p><p>
 * <describe></describe>
 *
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/8/23 10:19
 * @Since jdk1.8
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @RequestMapping("/hello")
    public String hello() {
        return demoService.hello();
    }

    @RequestMapping("/say")
    public String say() {
        return demoService.say();
    }
}
