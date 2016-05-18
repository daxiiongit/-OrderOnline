package com.sunyanxiong.ssm.service.impl;

import com.sunyanxiong.ssm.mapper.MealseriesMapper;
import com.sunyanxiong.ssm.po.Mealseries;
import com.sunyanxiong.ssm.po.MealseriesCustom;
import com.sunyanxiong.ssm.service.MealseriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/16 0016.
 */

@Service
public class MealseriesServiceImpl implements MealseriesService {

    // 调用mapper代理对象
    @Autowired
    private MealseriesMapper mealseriesMapper;

    @Override
    public List<Mealseries> findMealseries(Mealseries mealseries) throws Exception {
        return mealseriesMapper.findMealseries(mealseries);
    }

    // 更新菜系
    @Override
    public void updateMealseries(MealseriesCustom mealseriesCustom) throws Exception {
        mealseriesMapper.updateMealseries(mealseriesCustom);
    }

    @Override
    public void saveMealseries(String seriesname) throws Exception {
        mealseriesMapper.saveMealseries(seriesname);
    }

    @Override
    public MealseriesCustom findMealseriesById(int id) throws Exception {
        return mealseriesMapper.findMealseriesById(id);
    }

    @Override
    public void deleteMealseries(int id) throws Exception {
        mealseriesMapper.deleteMealseries(id);
    }
}
