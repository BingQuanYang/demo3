package com.smart.mybatis.controller;

import com.smart.mybatis.entity.User;
import com.smart.mybatis.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }
}
