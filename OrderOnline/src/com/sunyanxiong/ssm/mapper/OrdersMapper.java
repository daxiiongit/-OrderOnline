package com.sunyanxiong.ssm.mapper;

import com.sunyanxiong.ssm.po.OrderdtsCustom;
import com.sunyanxiong.ssm.po.Orders;
import com.sunyanxiong.ssm.po.OrdersCustom;
import com.sunyanxiong.ssm.vo.OrdersVo;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/21 0021.
 */
public interface OrdersMapper {
    // 查询订单
    List<Orders> findAllOrders() throws  Exception;

    // 修改订单状态
    void alertState(Orders orders) throws Exception;

    // 查询订单详情
    List<OrderdtsCustom> findAllOrderdts (int id) throws Exception;
}
