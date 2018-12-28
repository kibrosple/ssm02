package com.itheima.mapper;

import com.itheima.domain.Orders;

import java.util.List;

public interface OrdersMapper {
    /*查询所有订单*/
    List<Orders> findAll() throws Exception;
    /*查看1订单详情*/
    Orders findById(String id);
}
