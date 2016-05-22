package com.sunyanxiong.ssm.service;

import com.sunyanxiong.ssm.po.Orders;

import java.util.List;

/**
 * Description: 订单服务接口
 * <p>
 * Created by daxiongit on 2016/5/21 0021.
 */
public interface OrdersService {

    // 查询订单
    List<Orders> findAllOrders() throws  Exception;

    // 修改订单状态
    void alertState(int id,int orderstate) throws Exception;

}
