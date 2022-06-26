package com.huang.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/6/26 21:16
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloTest() {
        return "hello, world!";
    }
}
