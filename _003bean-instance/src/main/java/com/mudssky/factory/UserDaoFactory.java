package com.mudssky.factory;

import com.mudssky.dao.UserDao;
import com.mudssky.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
