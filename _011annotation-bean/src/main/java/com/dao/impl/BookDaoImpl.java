package com.dao.impl;

import com.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author mudssky
 */
//@Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    //private BookDaoImpl() {
    //    System.out.println("book dao constructor is running...");
    //}

    public void save() {
        System.out.println("book dao save ...");
    }
}
