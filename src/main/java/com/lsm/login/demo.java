package com.lsm.login;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class demo {
    @Before("execution(* com.lsm.dao.*.*(..))")
    public void begin(){
        System.out.println("--方法执行前---");
    }
    @After("execution(* com.lsm.dao.*.*(..))")
    public void end(){
        System.out.println("--方法执行后---");
    }
}
