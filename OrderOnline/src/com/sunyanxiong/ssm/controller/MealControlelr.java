package com.sunyanxiong.ssm.controller;

import com.sunyanxiong.ssm.page.Page;
import com.sunyanxiong.ssm.po.MealCustom;
import com.sunyanxiong.ssm.po.Mealseries;
import com.sunyanxiong.ssm.po.MealseriesCustom;
import com.sunyanxiong.ssm.service.MealService;
import com.sunyanxiong.ssm.service.MealseriesService;
import com.sunyanxiong.ssm.vo.MealVo;
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
       /* List<MealCustom> mealList = mealService.findAllMeal(null);
        model.addAttribute("mealList",mealList);
        return "/admin/query_meal";*/

        // 分页查询，每页5条,采用RowBounds方式

        List<MealCustom> mealList = mealService.findAllMeal(null);
        model.addAttribute("mealList",mealList);
        return "/admin/query_meal";
    }

    // 根据输入字段模糊查询菜品
    @RequestMapping(value = "/query_mealname")
    public String queryMealByName(Model model,@RequestParam(value = "mealname") String mealname,
                                  @RequestParam(value = "seriesname") String seriesname
                                  ) throws Exception {
        // 处理 seriesname = "" or null
        if (seriesname == null || seriesname == ""){
            seriesname = null;
        }
        // 添加模糊查询条件
        MealCustom mealCustom = new MealCustom();
        mealCustom.setMealname(mealname);

        // 添加精确查找条件
        MealseriesCustom mealseriesCustom = new MealseriesCustom();
        mealseriesCustom.setSeriesname(seriesname);
        mealCustom.setMealseriesCustom(mealseriesCustom);

        List<MealCustom> mealList = mealService.findAllMeal(mealCustom);
        model.addAttribute("mealList",mealList);

        // 查询参数回显
        model.addAttribute("mealname",mealname);
        model.addAttribute("seriesname",seriesname);

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
        // 通过id查找菜品信息


        mealService.saveMeal(mealCustom);
        return "redirect:query_meal.action";

    }

    // 到达修改页面
    @RequestMapping(value = "/toUpdateMeal")
    public String toUpdateMeal(Model model,@RequestParam(value = "id") int id) throws Exception {

        System.out.println(id);
        MealCustom mealCustom = mealService.findMealById(id);
        model.addAttribute("mealCustom",mealCustom);

        System.out.println(mealCustom);

        // 需要做级联
        List<Mealseries> msList = mealseriesService.findMealseries(null);
        model.addAttribute("msList",msList);

        return "/admin/update_meal";
    }

    // 更新菜品操作
    @RequestMapping(value = "/updatemeal")
    public String updateMeal(MealCustom mealCustom) throws Exception{
        mealService.updateMeal(mealCustom);
        return "redirect:query_meal.action";
    }

    // 删除菜品
    @RequestMapping(value = "/delete_meal")
    public String deleteMeal(@RequestParam(value = "id") int id) throws Exception{
        mealService.deleteMealById(id);
        return "redirect:query_meal.action";
    }

    // 测试分页
    @RequestMapping(value = "/meal_page")
    public String mealPage(@RequestParam(value = "currentPage") int currentPage,Model model) throws Exception{
        // 默认每页显示5条数据
        Page page = new Page();
        page.setPageSize(5);
        page.setCurrentPage(currentPage);
        page.setTotalCount(mealService.getMealCount());
        page.setPageCount(page.getPageCount());

        MealCustom mealCustom = new MealCustom();
        mealCustom.setPage(page);

        MealVo mealVo = mealService.getAllMeal(mealCustom);
        model.addAttribute("mealCustom",mealCustom);
        model.addAttribute("mealVo",mealVo);
        return "/admin/mealPage";
    }


}
