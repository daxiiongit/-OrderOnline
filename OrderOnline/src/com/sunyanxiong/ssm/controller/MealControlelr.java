package com.sunyanxiong.ssm.controller;

import com.sunyanxiong.ssm.po.MealCustom;
import com.sunyanxiong.ssm.po.Mealseries;
import com.sunyanxiong.ssm.po.MealseriesCustom;
import com.sunyanxiong.ssm.service.MealService;
import com.sunyanxiong.ssm.service.MealseriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Description: 菜品控制器
 * <p>
 * Created by daxiongit on 2016/5/19 0019.
 */

@Controller
public class MealControlelr {

    @Autowired
    private MealService mealService;

    @Autowired
    private MealseriesService mealseriesService;

    // 显示所有菜品信息列表
    @RequestMapping(value = "/query_meal")
    public String queryAllMeal(Model model) throws Exception {
        List<MealCustom> mealList = mealService.findAllMeal();
        model.addAttribute("mealList",mealList);
        return "/admin/query_meal";
    }

    // 到达新增菜品页面
    @RequestMapping(value = "/toSaveMeal")
    public String toSaveMeal(Model model) throws Exception {
        List<Mealseries> msList = mealseriesService.findMealseries(null);
        model.addAttribute("msList",msList);

        return "/admin/savemeal";
    }

    // 新增菜品
    @RequestMapping(value = "/saveMeal")
    public String saveMeal(MealCustom mealCustom) throws Exception{

        System.out.println(mealCustom);

        mealService.saveMeal(mealCustom);
        return "redirect:query_meal.action";

    }


}
