package com.dao.impl;

import com.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }

    //表示bean初始化对应的操作
    public void init() {
        System.out.println("init ...");
    }

    //表示bean销毁对应的操作
    public void destroy() {
        System.out.println("destroy...");
    }
}
