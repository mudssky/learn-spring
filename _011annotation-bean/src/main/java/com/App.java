package com;

import com.dao.BookDao;
import com.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //从类路径加载
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从系统路径加载
        //ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\coding\\Projects\\java\\learn-spring\\_010container\\src\\main\\resources\\applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //Bookdao bookdao =ctx.getBean("bookDao",Bookdao.class);
        bookDao.save();
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }

}
