package com.itheima.mapper;

import com.itheima.domain.UserInfo;

import java.util.List;

public interface UserMapper {
    /*查询所有用户信息*/
    List<UserInfo> findAll()throws Exception;
    /*通过用户姓名找到用户信息*/
    UserInfo findByUserName(String username) throws Exception;
    /*保存用户*/
    void saveUser(UserInfo userInfo)throws Exception;
    UserInfo findUserById(String id) throws Exception;
}
