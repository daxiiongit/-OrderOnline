package com.sunyanxiong.ssm.po;

/**
 * Description: 订单明细
 * <p>
 * Created by daxiongit on 2016/5/22 0022.
 */
public class Orderdts {

    private int id;
    private int orderid;
    private int mealid;
    private double price;
    private int mealcount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getMealid() {
        return mealid;
    }

    public void setMealid(int mealid) {
        this.mealid = mealid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMealcount() {
        return mealcount;
    }

    public void setMealcount(int mealcount) {
        this.mealcount = mealcount;
    }
}
