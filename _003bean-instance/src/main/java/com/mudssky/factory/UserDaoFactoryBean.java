package com.mudssky.factory;

import com.mudssky.dao.UserDao;
import com.mudssky.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author mudssky
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {


    /**
     * 代替原始实例工厂中创建对象的方法
     */
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }


    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
