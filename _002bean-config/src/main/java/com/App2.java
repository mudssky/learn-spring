package com;

import com.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author mudssky
 */
public class App2 {
    public static void main(String[] args) {
        //1.xml配置bean applicationContext.xml
        //2.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //3.   获取bean

        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");

        for (BookDao bookDao : Arrays.asList(bookDao1, bookDao2)) {
            System.out.println(bookDao);
        }
    }
}
