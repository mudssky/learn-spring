package com.mudssky.dao.impl;

import com.mudssky.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * @author mudssky
 */
@Repository()
public class BookDaoImpl implements BookDao {
    @Value("zhangsan")
    private String name;
    @Value("${username2}")
    private String name2;

    public void save() {
        System.out.println("book dao save ..." + name + name2);
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
