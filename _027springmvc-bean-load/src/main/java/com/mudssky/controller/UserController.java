package com.mudssky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save...");
        return "{'message':'save springmvc'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user delete...");
        return "{'message':'delete springmvc'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParameter(String name, int age) {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        return "{'type':'common'}";
    }
}
