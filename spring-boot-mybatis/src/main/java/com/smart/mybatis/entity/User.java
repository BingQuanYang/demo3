package com.smart.mybatis.entity;

import lombok.Data;

/**
    * 用户表
    */
@Data
public class User {
    /**
    * 主键
    */
    private Long userId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 0->正常,1->删除
    */
    private Integer deleteStatus;
}