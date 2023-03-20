package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.dao.BookDao.update())")
    private void pt() {
    }

    @Before("pt()")
    public void method() {
        Long startTime = System.currentTimeMillis();
        System.out.println(startTime);
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before advics");

        joinPoint.proceed();
        System.out.println("around after advice");
    }
}
