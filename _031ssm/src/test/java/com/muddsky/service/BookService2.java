package com.muddsky.service;


import com.mudssky.config.SpringConfig;
import com.mudssky.domain.Book;
import com.mudssky.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookService{
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById() {
        Book book = bookService.getById(1);
        System.out.println(book);

    }

    @Test
    public void testGetAll() {
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
}
