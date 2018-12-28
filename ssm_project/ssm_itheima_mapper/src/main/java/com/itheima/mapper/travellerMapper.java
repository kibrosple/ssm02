package com.itheima.mapper;

import com.itheima.domain.Traveller;

import java.util.List;

public interface travellerMapper {
    List<Traveller> findByOrdersId(String id) throws Exception;
}
