package com.mudssky.controller;

import com.mudssky.domain.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {


    public void save(Book book) {

    }

    public void update(Book book) {
    }

    public void delete(Integer id) {
    }

    public Book getById(Integer id) {
        return null;
    }

    public List<Book> getAll() {

        return null;
    }
}