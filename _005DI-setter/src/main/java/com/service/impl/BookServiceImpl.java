package com.service.impl;

import com.dao.BookDao;
import com.dao.UserDao;
import com.service.BookService;

public class BookServiceImpl implements BookService {

    // 5. 删除业务层中使用new的方式创建的对象
    private BookDao bookDao;

    private UserDao userDao;

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }

    // 6. 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}