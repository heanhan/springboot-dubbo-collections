package com.example.common.service;

import com.example.common.entity.pojo.User;

import java.util.List;

public interface IUserService {

    /**
     * 添加用户
     * @param user 用户
     * @return int
     */
    int addUser(User user);

    /**
     * 批量添加用户
     * @param users 用户集合
     * @return int
     */
    int addUserbitch(List<User> users);
}
