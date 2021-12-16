package com.banmalaila.project.dubootest;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.banmalaila.project")
@EnableDubbo(scanBasePackages = "com.banmalaila.project")
public class DubooTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubooTestApplication.class, args);
    }

}
