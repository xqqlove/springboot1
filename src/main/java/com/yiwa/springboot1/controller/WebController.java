package com.yiwa.springboot1.controller;

import com.yiwa.springboot1.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping(name = "/getUser",method = RequestMethod.POST)
    public User getUser(){
        User u=new User();
        u.setName("xiaoming");
        u.setAge(19);
        u.setPass("123456");
        return u;
    }
}
