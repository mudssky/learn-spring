package com.mudssky.controller;

import com.mudssky.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParameterDifferentName(@RequestParam("username") String name, int age) {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        return "{'type':'common'}";
    }

    @RequestMapping("/pojoContain")
    @ResponseBody
    public String pojoContainParam(User user) {
        System.out.println("pojo参数:" + user);
        return "{'type':'pojo'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println("likes:" + Arrays.toString(likes));
        return "{'type':'array'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes) {
        System.out.println("likes:" + likes);
        return "{'type':'list'}";
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes) {
        System.out.println("likes:" + likes);
        return "{'type':'listjson'}";
    }

    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println("user:" + user);
        return "{'type':'userjson'}";
    }

    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> users) {
        System.out.println("user:" + users);
        return "{'type':'userjson'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dataParam(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) {
        System.out.println("date:" + date + "date2:" + date2);
        return "{'type':'date'}";
    }

    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(@RequestBody User user) {

        return user;
    }


}
