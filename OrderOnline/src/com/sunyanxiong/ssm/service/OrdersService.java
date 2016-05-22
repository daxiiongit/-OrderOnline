package com.sunyanxiong.ssm.service;

import com.sunyanxiong.ssm.po.OrderdtsCustom;
import com.sunyanxiong.ssm.po.Orders;
import com.sunyanxiong.ssm.vo.OrdersVo;

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

    // 查询订单详情
    List<OrderdtsCustom> findAllOrderdts (int id) throws Exception;

}
