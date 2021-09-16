package com.codingfuture.mapper;

import com.codingfuture.entity.User;

public interface UserMapper {
    User findDetailAllByUserId(Integer id);

    User findAllByUserId(int id);
}
