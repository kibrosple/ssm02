package com.itheima.mapper;

import com.itheima.domain.UserInfo;

import java.util.List;

public interface UserMapper {
    List<UserInfo> findAll()throws Exception;
    UserInfo findByUserName(String username) throws Exception;
}
