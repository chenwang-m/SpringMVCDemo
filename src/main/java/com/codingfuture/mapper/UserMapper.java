package com.codingfuture.mapper;

import com.codingfuture.entity.User;

import java.util.List;

public interface UserMapper {
    User findDetailAllByUserId(Integer id);

    List<User> findOrderByUserId(int id);
}
