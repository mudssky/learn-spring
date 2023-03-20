package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.dao.BookDao.*(..))")
    private void pt() {
    }

    @Before("pt()")
    public void before(JoinPoint jp) {
        System.out.println("before advice");
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
    }

    @After("pt()")
    public void after(JoinPoint jp) {
        System.out.println("after advice");
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
    }

    @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(Object ret) {
        System.out.println("after returning advice");
        System.out.println(ret);
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before advics");
        Object[] args = joinPoint.getArgs();
        args[0] = 666;
        joinPoint.proceed(args);
        System.out.println("around after advice");
    }
}
