package com.mudssky;

import com.mudssky.config.SpringConfig;
import com.mudssky.domain.Account;
import com.mudssky.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account ac = (Account) accountService.findAll();
        System.out.println(ac);

    }
}
