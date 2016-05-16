package com.sunyanxiong.ssm.service;

import com.sunyanxiong.ssm.po.Mealseries;

import java.util.List;

/**
 * Description: 查询菜系
 * <p>
 * Created by daxiongit on 2016/5/16 0016.
 */
public interface MealseriesService {

    List<Mealseries> findMealseries(Mealseries mealseries) throws Exception;

}
