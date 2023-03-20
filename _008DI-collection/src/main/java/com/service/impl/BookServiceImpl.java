package com.service.impl;

import com.dao.BookDao;
import com.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    // 6. 提供对应的set方法

}