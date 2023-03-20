package com;

import com.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
        //通过实例对象创建工厂
        //UserDaoFactory userDaoFactory = new UserDaoFactory();
        //    通过实例工厂创建对象
        //UserDao userDao = userDaoFactory.getUserDao();
        //userDao.save();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.save();


    }
}
