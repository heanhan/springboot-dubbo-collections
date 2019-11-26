package com.example.common.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : zhaojh
 * @date : 2019-11-26
 * @function :用户信息
 *
 *
 * 注意：  这里有一个坑，就是该实体类一定要实现java.io.Serializable这个接口
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String id;//用户id

    private String userName;//用户名

    private String password;//密码

    private int age;//年龄

    private String telphone;//联系方式

    private String email;//邮件

    private String info;//个人简介
}
