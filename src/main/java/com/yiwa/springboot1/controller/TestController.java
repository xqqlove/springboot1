package com.yiwa.springboot1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(String name){
        return "hello world1,"+name;
    }
    @RequestMapping("/get")
    public String get(){
        return "get";
    }

}
