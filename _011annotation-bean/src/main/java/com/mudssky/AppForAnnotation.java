package com.mudssky;

import com.mudssky.dao.BookDao;
import com.mudssky.dao.config.SpringConfig;
import com.mudssky.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        //从类路径加载
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        //从系统路径加载
        //ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\coding\\Projects\\java\\learn-spring\\_010container\\src\\main\\resources\\applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //Bookdao bookdao =ctx.getBean("bookDao",Bookdao.class);
        bookDao.save();
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }

}
