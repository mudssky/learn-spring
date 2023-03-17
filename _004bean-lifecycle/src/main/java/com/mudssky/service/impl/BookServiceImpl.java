package com.mudssky.service.impl;

import com.mudssky.dao.BookDao;
import com.mudssky.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    // 5. 删除业务层中使用new的方式创建的对象
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    // 6. 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Service init...");
    }
}