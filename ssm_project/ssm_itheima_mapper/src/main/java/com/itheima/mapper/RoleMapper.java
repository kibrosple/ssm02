package com.itheima.mapper;

import com.itheima.domain.Role;

import java.util.List;

public interface RoleMapper {
    List<Role> findByUserId(String id) throws Exception;
}
