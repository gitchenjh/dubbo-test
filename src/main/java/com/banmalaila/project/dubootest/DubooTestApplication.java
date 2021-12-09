package com.banmalaila.project.dubootest;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.banmalaila.project")
@EntityScan("com.banmalaila.project")
@ServletComponentScan("com.banmalaila.project")
@EnableDubbo(scanBasePackages = "com.banmalailaproject")
public class DubooTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubooTestApplication.class, args);
    }

}
