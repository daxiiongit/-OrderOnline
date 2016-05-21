package com.sunyanxiong.ssm.service;

import com.sunyanxiong.ssm.po.MealCustom;

import java.util.List;

/**
 * Description: 菜品接口
 * <p>
 * Created by daxiongit on 2016/5/19 0019.
 */
public interface MealService {

    // 查询全部菜品列表
    List<MealCustom> findAllMeal () throws Exception;

    // 新增菜系
    void saveMeal(MealCustom mealCustom) throws Exception;

}
