package com.sunyanxiong.ssm.po;

import java.util.Date;

/**
 * Description: 订单信息表
 * <p>
 * Created by daxiongit on 2016/5/21 0021.
 */
public class Orders {

    private int id;
    private int userid;
    private Date ordertime;
    private int orderstate;
    private double orderprice;

    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public int getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(int orderstate) {
        this.orderstate = orderstate;
    }

    public double getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(double orderprice) {
        this.orderprice = orderprice;
    }
}
