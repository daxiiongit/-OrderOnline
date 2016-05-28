package com.sunyanxiong.ssm.mapper;

import com.sunyanxiong.ssm.page.Page;
import com.sunyanxiong.ssm.po.MealCustom;
import com.sunyanxiong.ssm.po.Mealseries;

import java.util.List;

/**
 * Description: 查询菜品 dao 接口
 * <p>
 * Created by daxiongit on 2016/5/18 0018.
 */
public interface MealMapper {

    /*// 查询全部菜品列表
    List<MealCustom> findAllMeal () throws Exception;*/

    // 查询全部菜品列表,并且加上模糊查询操作
    List<MealCustom> findAllMeal (MealCustom mealCustom) throws Exception;

    // 新增菜品
    void saveMeal(MealCustom mealCustom) throws Exception;

    // 修改菜品
    void updateMeal(MealCustom mealCustom) throws Exception;

    // 根据id查找菜品信息
    MealCustom findMealById(int id) throws Exception;

    // 删除菜品信息
    void deleteMealById(int id) throws Exception;

    /*********************************************************************************/
    /** 测试分页 **/
    int getMealCount() throws Exception;
    List<MealCustom> getAllMeal(MealCustom mealCustom) throws Exception;
    /*List<MealCustom> getAllMeal(Page page) throws Exception;*/
    /*********************************************************************************/
}
