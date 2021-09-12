package com.codingfuture.web.controller;

import com.codingfuture.entity.Person;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;

@Controller
public class DemoController {
    @ResponseBody
    //请求路径
    @RequestMapping("/test")
    //@DateTimeFormat 时间字符串格式注解
    public Person test(String name, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, int[] ids) {
        Person person = new Person();
        person.setName(name);
        person.setSex("nan");
        System.out.println(date);
        System.out.println(Arrays.toString(ids));
        return person;
    }

    @RequestMapping("/test2")
    public String test2() {
        return "";
    }
}
