package com.smart.mybatis.service.impl;

import com.smart.mybatis.entity.User;
import com.smart.mybatis.mapper.UserMapper;
import com.smart.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.selectList();
    }
}
