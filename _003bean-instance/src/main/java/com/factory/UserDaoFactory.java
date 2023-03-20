package com.factory;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
