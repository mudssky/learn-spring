package com.service.impl;

import com.dao.AccountDao;
import com.service.AccountService;
import com.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    public void transfer(String out, String in, Double money) {
        try {

            accountDao.outMoney(out, money);
            int a = 1 / 0;
            accountDao.inMoney(in, money);

        } finally {

            logService.log(out, in, money);
        }
    }

}