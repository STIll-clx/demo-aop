package com.still.demo.aspectj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectjApplication {

    public static void main(String[] args) {
        SpringApplication.run(AspectjApplication.class, args);
    }

}
