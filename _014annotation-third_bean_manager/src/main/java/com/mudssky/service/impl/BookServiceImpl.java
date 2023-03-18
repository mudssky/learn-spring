package com.mudssky.service.impl;

import com.mudssky.dao.BookDao;
import com.mudssky.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class BookServiceImpl implements BookService {
    @Autowired
    //@Qualifier("bookDao")
    private BookDao bookDao;

    public void save() {
        bookDao.save();
        System.out.println("book service save ...");
    }


}