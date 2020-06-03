package com.saksham.helloworld.model;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldModel {
    public String helloWorld(){
        return "Hello World";
    }

    public String helloUser(String name){
        return "Hello "+name;
    }
}
