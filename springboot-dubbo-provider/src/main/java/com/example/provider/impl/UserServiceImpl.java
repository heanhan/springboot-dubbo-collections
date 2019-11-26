package com.example.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.common.entity.pojo.User;
import com.example.common.service.IUserService;

import java.util.List;

/**
 * @author : zhaojh
 * @date : 2019-11-26
 * @function :用户的实现类
 *
 * 注: @Service 注解是  com.alibaba.dubbo.config.annotation.Service包下的
 */

@Service(version = "1.0.0")
public class UserServiceImpl implements IUserService {
    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int addUserbitch(List<User> users) {
        return 0;
    }
}
