package com.sunyanxiong.ssm.service.impl;

import com.sunyanxiong.ssm.mapper.MealMapper;
import com.sunyanxiong.ssm.mapper.MealseriesMapper;
import com.sunyanxiong.ssm.po.MealCustom;
import com.sunyanxiong.ssm.po.Mealseries;
import com.sunyanxiong.ssm.po.MealseriesCustom;
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

    @Override
    public List<MealCustom> findAllMeal() throws Exception {
        return mealMapper.findAllMeal();
    }

    @Override
    public void saveMeal(MealCustom mealCustom) throws Exception {
        // 执行保存操作
        mealMapper.saveMeal(mealCustom);
    }
}
