package com.codingfuture.web.controller;

import com.codingfuture.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @ResponseBody
    @RequestMapping("/test")
    public Person test(){
        Person person = new Person();
        person.setName("wang");
        person.setSex("nan");
        return person;
    }
}
