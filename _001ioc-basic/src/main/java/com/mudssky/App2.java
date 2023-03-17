package com.mudssky;

import com.mudssky.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mudssky
 */
public class App2 {
    public static void main(String[] args) {
        //1.xml配置bean applicationContext.xml
        //2.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //3.   获取bean

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}
