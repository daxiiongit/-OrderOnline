package com.sunyanxiong.ssm.service.impl;

import com.sunyanxiong.ssm.mapper.MealMapper;
import com.sunyanxiong.ssm.po.MealCustom;
import com.sunyanxiong.ssm.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/19 0019.
 */

@Service
public class MealServiceImpl implements MealService {

    // mapper代理对象
    @Autowired
    private MealMapper mealMapper;

    /*@Override
    public List<MealCustom> findAllMeal() throws Exception {
        return mealMapper.findAllMeal();
    }*/


    @Override
    public List<MealCustom> findAllMeal(MealCustom mealCustom) throws Exception {
        return mealMapper.findAllMeal(mealCustom);
    }


    @Override
    public void saveMeal(MealCustom mealCustom) throws Exception {
        // 执行保存操作
        mealMapper.saveMeal(mealCustom);
    }

    @Override
    public void updateMeal(MealCustom mealCustom) throws Exception {
        // 执行修改操作
        mealMapper.updateMeal(mealCustom);
    }

    @Override
    public MealCustom findMealById(int id) throws Exception {
        return mealMapper.findMealById(id);
    }

    @Override
    public void deleteMealById(int id) throws Exception {
        mealMapper.deleteMealById(id);
    }
}
