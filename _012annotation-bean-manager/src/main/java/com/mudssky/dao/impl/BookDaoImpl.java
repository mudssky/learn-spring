package com.mudssky.dao.impl;

import com.mudssky.dao.BookDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * @author mudssky
 */
//@Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {


    public void save() {
        System.out.println("book dao save ...");
    }

    @PostConstruct
    public void init() {
        System.out.println("book dao init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("book dao destroy...");
    }
}
