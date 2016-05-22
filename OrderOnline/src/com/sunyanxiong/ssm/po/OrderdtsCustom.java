package com.sunyanxiong.ssm.po;

/**
 * Description: 订单详情扩展
 * <p>
 * Created by daxiongit on 2016/5/22 0022.
 */
public class OrderdtsCustom extends Orderdts {

    // 订单信息
    private OrdersCustom ordersCustom;

    public OrdersCustom getOrdersCustom() {
        return ordersCustom;
    }

    public void setOrdersCustom(OrdersCustom ordersCustom) {
        this.ordersCustom = ordersCustom;
    }

    // 菜品信息
    private MealCustom mealCustom;

    public MealCustom getMealCustom() {
        return mealCustom;
    }

    public void setMealCustom(MealCustom mealCustom) {
        this.mealCustom = mealCustom;
    }
}
