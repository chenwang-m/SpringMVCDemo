package com.codingfuture.web.controller;

import com.codingfuture.entity.Person;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;

@Controller
@RequestMapping("/person")
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

    //通过session对象得到session中存放的对象
    @ResponseBody
    //@RequestMapping(value = "/test2",method = RequestMethod.GET)
    @GetMapping("/test2")
    public String test2(HttpSession httpSession) {
        httpSession.setAttribute("count", 1);
        int count = (int) httpSession.getAttribute("count");
        System.out.println(count);
        return "ok";
    }

    @ResponseBody
    @GetMapping("/test3")
    //@RequestParam 该注解用来标注一个请求参数
    //defaultValue = "no name"
    public String test3(@RequestParam(value = "user_name", required = false, defaultValue = "no_name") String name) {
        return name;
    }

    //RESTful 请求方式
    //@PathVariable 将路径的一部分作为请求参数
    @ResponseBody
    @RequestMapping(value = {"/test4/{id}", "/test4-1/{id}"})
    public Person test4(@PathVariable Integer id) {
        Person person = new Person();
        person.setId(id);
        person.setName("666");
        person.setSex("nan");
        return person;
    }

    @ResponseBody
    @RequestMapping("/test5")
    public String test5(@RequestBody Person person) {
        System.out.println(person);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/test6")
    public Person test6(@RequestBody Person person) {
        System.out.println(person);
        return person;
    }
}
