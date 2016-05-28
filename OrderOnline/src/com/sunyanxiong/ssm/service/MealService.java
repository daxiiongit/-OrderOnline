package com.sunyanxiong.ssm.service;

import com.sunyanxiong.ssm.page.Page;
import com.sunyanxiong.ssm.po.MealCustom;
import com.sunyanxiong.ssm.vo.MealVo;

import java.util.List;

/**
 * Description: 菜品接口
 * <p>
 * Created by daxiongit on 2016/5/19 0019.
 */
public interface MealService {

    /*// 查询全部菜品列表
    List<MealCustom> findAllMeal () throws Exception;*/

    // 查询全部菜品列表
    List<MealCustom> findAllMeal (MealCustom mealCustom) throws Exception;

    // 新增菜系
    void saveMeal(MealCustom mealCustom) throws Exception;

    // 修改菜品
    void updateMeal(MealCustom mealCustom) throws Exception;

    // 根据id查找菜品信息
    MealCustom findMealById(int id) throws Exception;

    // 删除菜品信息
    void deleteMealById(int id) throws Exception;

    // 测试分页
    int getMealCount() throws Exception;
    MealVo getAllMeal(MealCustom mealCustom) throws Exception;

}
