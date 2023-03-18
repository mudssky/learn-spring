package com.mudssky.dao.impl;

import com.mudssky.dao.BookDao;

/**
 * @author mudssky
 */
public class BookDaoImpl implements BookDao {

    private BookDaoImpl() {
        System.out.println("book dao constructor is running...");
    }

    public void save() {
        System.out.println("book dao save ...");
    }
}
