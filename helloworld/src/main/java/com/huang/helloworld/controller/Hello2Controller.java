package com.huang.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName Hello2Controller
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/6/27 22:22
 * @Version 1.0
 */
@Controller
@RequestMapping("/hello")
public class Hello2Controller {

    @RequestMapping("/test")
    @ResponseBody
    public String myHello() {
        return "hello, world!";
    }

}
