package com.sunyanxiong.ssm.mapper;

import com.sunyanxiong.ssm.po.Mealseries;

import java.util.List;

/**
 * Description: 查询菜系接口
 * <p>
 * Created by daxiongit on 2016/5/16 0016.
 */
public interface MealseriesMapper {

    List<Mealseries> findMealseries(Mealseries mealseries) throws Exception;

}
