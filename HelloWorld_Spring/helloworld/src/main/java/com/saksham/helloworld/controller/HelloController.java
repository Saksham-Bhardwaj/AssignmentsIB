package com.saksham.helloworld.controller;
import com.saksham.helloworld.model.HelloWorldModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloWorldModel model;

    @GetMapping("/helloworld")
    public String hello(){
        return model.helloWorld();
    }

    @GetMapping("/hello")
    public String helloUser(@RequestParam(name="name" , defaultValue = "World")String name){
        return model.helloUser(name);
    }
}
