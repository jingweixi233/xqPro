package com.wang.service;

import com.wang.model.User;
import com.wang.repository.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    // 注入mapper类
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }


}
