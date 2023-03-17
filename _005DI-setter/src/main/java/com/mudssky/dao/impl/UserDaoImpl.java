package com.mudssky.dao.impl;

import com.mudssky.dao.UserDao;

/**
 * @author mudssky
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao saved");
    }
}
