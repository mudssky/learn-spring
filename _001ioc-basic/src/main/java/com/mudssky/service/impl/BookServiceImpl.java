package com.mudssky.service.impl;

import com.mudssky.dao.BookDao;
import com.mudssky.dao.impl.BookDaoImpl;
import com.mudssky.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl() ;
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}