package com.itheima.service;

import com.itheima.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    /*查询所有用户*/
    List<UserInfo> findAll()throws Exception;
    /*保存用户*/
    void saveUser(UserInfo userInfo)throws Exception;
    /*通过id查找用户*/
    UserInfo findUserById(String id) throws Exception;
    /*修改用户*/
    void updateUser(UserInfo userInfo)throws Exception;
}
