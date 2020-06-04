package com.saksham.aop;

import org.springframework.stereotype.Component;

@Component
public class Business{
    public void businessLogic(){
        System.out.println("This function implements business logic");
    }
}