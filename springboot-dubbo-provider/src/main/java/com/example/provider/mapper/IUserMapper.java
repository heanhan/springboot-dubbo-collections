package com.example.provider.mapper;

import com.example.common.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author : zhaojh
 * @date : 2019-11-26
 * @function :
 */

@Mapper
public interface IUserMapper {

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
