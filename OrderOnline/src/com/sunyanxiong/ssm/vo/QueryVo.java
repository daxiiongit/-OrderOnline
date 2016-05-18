package com.sunyanxiong.ssm.vo;

import com.sunyanxiong.ssm.po.MealCustom;

import java.util.List;

/**
 * Description: 查询包装类
 * <p>
 * Created by daxiongit on 2016/5/18 0018.
 */
public class QueryVo {

    // 查询菜品返回集合
    private int id;
    private int mealseriesid;
    private String mealname;
    private double mealprice;
    private String seriesname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMealseriesid() {
        return mealseriesid;
    }

    public void setMealseriesid(int mealseriesid) {
        this.mealseriesid = mealseriesid;
    }

    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public double getMealprice() {
        return mealprice;
    }

    public void setMealprice(double mealprice) {
        this.mealprice = mealprice;
    }

    public String getSeriesname() {
        return seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname;
    }
}
