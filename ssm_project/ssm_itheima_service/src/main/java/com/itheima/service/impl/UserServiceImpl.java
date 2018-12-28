package com.itheima.service.impl;

import com.itheima.domain.Role;
import com.itheima.domain.UserInfo;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserInfo> findAll() throws Exception {
        return userMapper.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        /*通过username找到userinfo对象*/
        UserInfo userInfo = null;
        try {
            userInfo = userMapper.findByUserName(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        User user = new User(userInfo.getUsername(),"{noop}"+userInfo.getPassword(),userInfo.getStatus()==0?false:true,
                true,true,true,getRoles(userInfo.getRoles()));
        /*将userinfo对象装入userdetailsservice中的user对象中*/
        return user;
    }
    public List<SimpleGrantedAuthority> getRoles(List<Role> rolesList){
        List<SimpleGrantedAuthority> roles=new ArrayList<SimpleGrantedAuthority>();
        for (Role role:rolesList){
            SimpleGrantedAuthority sga=new SimpleGrantedAuthority("ROLE_"+role.getRoleName());
            roles.add(sga);
        }
        return roles;
    }
}
