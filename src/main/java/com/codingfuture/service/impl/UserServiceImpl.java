package com.codingfuture.service.impl;

import com.codingfuture.entity.User;
import com.codingfuture.mapper.UserMapper;
import com.codingfuture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User findDetailAllByUserId(Integer id) {
        return userMapper.findDetailAllByUserId(id);
    }
}
