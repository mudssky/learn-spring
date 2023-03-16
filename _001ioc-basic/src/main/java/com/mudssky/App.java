package com.mudssky;

import com.mudssky.service.BookService;
import com.mudssky.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args){
        BookService bookService=new BookServiceImpl();
        bookService.save();
    }

}
