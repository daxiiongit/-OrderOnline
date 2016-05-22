package com.sunyanxiong.ssm.service.impl;

import com.sunyanxiong.ssm.mapper.OrdersMapper;
import com.sunyanxiong.ssm.po.OrderdtsCustom;
import com.sunyanxiong.ssm.po.Orders;
import com.sunyanxiong.ssm.po.OrdersCustom;
import com.sunyanxiong.ssm.service.OrdersService;
import com.sunyanxiong.ssm.vo.OrdersVo;
import com.sunyanxiong.ssm.vo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/21 0021.
 */

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> findAllOrders() throws Exception {
        return ordersMapper.findAllOrders();
    }

    @Override
    public void alertState(int id, int orderstate) throws Exception {
        Orders orders = new Orders();
        orders.setId(id);
        orders.setOrderstate(orderstate);

        ordersMapper.alertState(orders);
    }

    @Override
    public List<OrderdtsCustom> findAllOrderdts(int id) throws Exception {
        return ordersMapper.findAllOrderdts(id);
    }
}
