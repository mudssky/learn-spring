package com.mudssky.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    public String getById(@PathVariable String id) {
        System.out.println("id===" + id);
        return "hello " + id;
    }
}
