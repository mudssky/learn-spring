package com;

import com.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mudssky
 */
public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注册关闭钩子，这样jvm虚拟机关闭前会先推出容器
        ctx.registerShutdownHook();
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        //手动关容器
        //    ctx.close();
            
    }
}
