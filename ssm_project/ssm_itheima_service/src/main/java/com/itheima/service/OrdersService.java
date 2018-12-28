package com.itheima.service;

import com.itheima.domain.Orders;

import java.util.List;

public interface OrdersService {
    /*查询所有订单*/
    List<Orders> findAll(Integer pageNum,Integer pageSize) throws Exception;
    /*通过id查找订单详情*/
    Orders findById(String id);
}
