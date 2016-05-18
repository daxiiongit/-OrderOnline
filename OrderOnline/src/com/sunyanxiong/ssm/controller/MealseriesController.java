package com.sunyanxiong.ssm.controller;

import com.sunyanxiong.ssm.po.Mealseries;
import com.sunyanxiong.ssm.po.MealseriesCustom;
import com.sunyanxiong.ssm.service.MealseriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/16 0016.
 */

@Controller
public class MealseriesController {

    @Autowired
    private MealseriesService mealseriesService;

    // 查询菜系列表
    @RequestMapping(value = "/query_mealseries")
    public String queryMealseries(@RequestParam(value = "mealseries",required = false) Mealseries mealseries, Model model) throws Exception {

        // 调用查询方法
        List<Mealseries> mealseriesList =  mealseriesService.findMealseries(mealseries);
        // 从数据库中查询到的数据放回给前端页面
        model.addAttribute("mealseriesList",mealseriesList);
        // 重定向到后台显示菜系列表的页面
        return "/admin/query_mealseries";
    }

    // 进入更新页面
    @RequestMapping(value = "/to_updatems")
    public String toUpdateMs(@RequestParam(value = "id") int id ,Model model) throws Exception {

        MealseriesCustom mealseriesCustom = mealseriesService.findMealseriesById(id);

        model.addAttribute("mealseriesCustom",mealseriesCustom);
        return "/admin/editms";
    }

    // 更新菜系
    @RequestMapping(value = "/update_mealseries")
    public String updateMealseries(@RequestParam(value = "id") int id,@RequestParam(value = "seriesname") String seriesname) throws Exception {

        MealseriesCustom mealseriesCustom = new MealseriesCustom();
        mealseriesCustom.setId(id);
        mealseriesCustom.setSeriesname(seriesname);

        mealseriesService.updateMealseries(mealseriesCustom);
        return "redirect:query_mealseries.action";
    }

    // 进入新增页面
    @RequestMapping(value = "/toSaveMs")
    public String toMs(){
        return "/admin/toms";
    }

    // 新增菜系
    @RequestMapping(value = "/save_mealseries")
    public String saveMealseries(@RequestParam(value = "seriesname") String seriesname) throws Exception {
        mealseriesService.saveMealseries(seriesname);
        return "redirect:query_mealseries.action";
    }

}
