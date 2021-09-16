package com.codingfuture.web.controller;

import com.codingfuture.entity.User;
import com.codingfuture.service.UserService;
import com.codingfuture.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Result findDetailAllByUserId(@PathVariable Integer id) {
//        return userService.findDetailAllByUserId(id);
        return Result.ok(userService.findDetailAllByUserId(id));
    }
}
