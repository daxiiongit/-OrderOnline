package com.sunyanxiong.ssm.po;


import com.sunyanxiong.ssm.page.Page;

/**
 * Description: 菜品扩展类
 * <p>
 * Created by daxiongit on 2016/5/18 0018.
 */
public class MealCustom extends Meal{

    // 要关联查询的菜系属性
    private MealseriesCustom mealseriesCustom;

    public MealseriesCustom getMealseriesCustom() {
        return mealseriesCustom;
    }

    public void setMealseriesCustom(MealseriesCustom mealseriesCustom) {
        this.mealseriesCustom = mealseriesCustom;
    }

    // 测试分页
    private Page page;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

}

