package com.sunyanxiong.ssm.po;

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
}
