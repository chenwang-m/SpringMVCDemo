package com.codingfuture.service;

import com.codingfuture.entity.User;

import java.util.List;

public interface UserService {
    User findDetailAllByUserId(Integer id);
    List<User> findOrderByUserId(int id);
}
