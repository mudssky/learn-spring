package com.mudssky.service.impl;

import com.mudssky.service.BookService;
import org.springframework.stereotype.Service;

@Service()
public class BookServiceImpl implements BookService {


    public void save() {
        System.out.println("book service save ...");
    }


}