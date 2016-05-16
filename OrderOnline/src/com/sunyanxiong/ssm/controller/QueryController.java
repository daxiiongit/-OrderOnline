package com.sunyanxiong.ssm.controller;

import com.sunyanxiong.ssm.po.Mealseries;
import com.sunyanxiong.ssm.service.MealseriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/16 0016.
 */

@Controller
public class QueryController {

    @Autowired
    private MealseriesService mealseriesService;

    // 查询菜系列表
    @RequestMapping("/query_mealseries")
    public String queryMealseries(@RequestParam(value = "mealseries") Mealseries mealseries, Model model) {

        try {
            // 调用查询方法
            Mealseries mealseriesList = (Mealseries) mealseriesService.findMealseries(mealseries);
            // 从数据库中查询到的数据放回给前端页面
            model.addAttribute("mealseriesList",mealseriesList);
            // 重定向到后台显示菜系列表的页面
            return "redirect:/show";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
