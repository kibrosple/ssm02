package com.itheima.mapper;

import com.itheima.domain.Member;

public interface MemberMapper  {
    Member findById(String id) throws Exception;
}
