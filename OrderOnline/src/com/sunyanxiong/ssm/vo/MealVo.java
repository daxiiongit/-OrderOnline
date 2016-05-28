package com.sunyanxiong.ssm.vo;

import com.sunyanxiong.ssm.page.Page;
import com.sunyanxiong.ssm.po.MealCustom;

import java.util.List;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/28 0028.
 */
public class MealVo {

    // 查询结果集
    private List mealCustomList;

    public List getMealCustomList() {
        return mealCustomList;
    }

    public void setMealCustomList(List mealCustomList) {
        this.mealCustomList = mealCustomList;
    }

   /* // 测试分页
    private Page page;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }*/
}
