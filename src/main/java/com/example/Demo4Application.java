package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Demo4Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }

    //部署到tomcat需要继承springboot初始化类，并重写configure方法。
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(Demo4Application.class);
    }

}
