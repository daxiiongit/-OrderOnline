package com.sunyanxiong.ssm.mapper;

import com.sunyanxiong.ssm.po.Mealseries;
import com.sunyanxiong.ssm.po.MealseriesCustom;

import java.util.List;

/**
 * Description: 查询菜系接口
 * <p>
 * Created by daxiongit on 2016/5/16 0016.
 */
public interface MealseriesMapper {

    // 查询菜系列表
    List<Mealseries> findMealseries(Mealseries mealseries) throws Exception;
    // 更新菜系名称
    void updateMealseries(MealseriesCustom mealseriesCustom) throws Exception;

    // 新增菜系
    void saveMealseries(String seriesname) throws Exception;
    // 根据id查找菜系
    MealseriesCustom findMealseriesById(int id) throws Exception;
    // 根据id删除菜系
    void deleteMealseries(int id)throws Exception;

}
