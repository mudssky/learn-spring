package com.mudssky;

import com.mudssky.config.SpringConfig;
import com.mudssky.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));
        System.out.println("Hello World!");
    }
}
