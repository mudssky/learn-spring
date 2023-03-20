package com.dao.impl;

import com.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author mudssky
 */
@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        //记录程序当前执行执行（开始时间）
        Long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.println("book dao save ...");
    }

    public void update() {
        System.out.println("book dao update ...");
    }

    public void delete() {
        System.out.println("book dao delete ...");
    }

    public void select() {
        System.out.println("book dao select ...");
    }
}