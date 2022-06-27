package com.huang.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication标注这个类是一个springboot的应用
@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
        // 将springboot应用启动
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
