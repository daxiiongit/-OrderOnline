package com.sunyanxiong.ssm.vo;

import com.sunyanxiong.ssm.po.OrderdtsCustom;
import com.sunyanxiong.ssm.po.Orders;

import java.util.List;

/**
 * Description: 订单相关
 * <p>
 * Created by daxiongit on 2016/5/21 0021.
 */
public class OrdersVo {

    // 查询订单返回集合
    private List<Orders> ordersList;

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    // 查询订单详情返回结果集
    private List<OrderdtsCustom> orderdtsCustomList;

    public List<OrderdtsCustom> getOrderdtsCustomList() {
        return orderdtsCustomList;
    }

    public void setOrderdtsCustomList(List<OrderdtsCustom> orderdtsCustomList) {
        this.orderdtsCustomList = orderdtsCustomList;
    }
}
