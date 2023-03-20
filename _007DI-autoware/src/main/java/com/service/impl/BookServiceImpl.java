package com.service.impl;

import com.dao.BookDao;
import com.dao.UserDao;
import com.service.BookService;

public class BookServiceImpl implements BookService {

    private UserDao userDao;
    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }

    // 6. 提供对应的set方法

}