package com.mudssky.service.impl;

import com.mudssky.dao.AccountDao;
import com.mudssky.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@Service
public class AccountServiceImpl {
    @Autowired
    private AccountDao accountDao;

    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
