package com.saksham.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectHelper {
    @Before("execution(public void businessLogic())")
    public void beforeCall(){
        System.out.println("Hey");
    }

    @After("execution(public void businessLogic())")
    public void afterCall(){
        System.out.println("Bye");
    }
}
