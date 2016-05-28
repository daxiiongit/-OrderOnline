package com.sunyanxiong.ssm.test;

import com.sunyanxiong.ssm.mapper.MealMapper;
import com.sunyanxiong.ssm.page.Page;
import com.sunyanxiong.ssm.po.MealCustom;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Description: 测试分页
 * <p>
 * Created by daxiongit on 2016/5/28 0028.
 */
public class PageTest {

    private ApplicationContext applicationContext;

    @Before
    public void before() {

        // 读取spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext-*.xml");

    }

    // 测试查询菜品分页
   /* @Test
    public void testMealPage() throws Exception{
        MealMapper mealMapper = (MealMapper) applicationContext.getBean("mealMapper");

        Page page = new Page();
        // 当前页
        page.setCurrentPage(2);
        // 每页记录数
        page.setPageSize(5);
        // 总记录数
        page.setTotalCount(mealMapper.getMealCount());

        System.out.println(page.getTotalCount());
        System.out.println(page.getPageCount());
        System.out.println(page.getCurrentPage());
        System.out.println(page.getPrePage());
        System.out.println(page.getNextPage());
        System.out.println(page.getPageIndex());

        List<MealCustom> list = mealMapper.getAllMeal(page);
        for (MealCustom mealList : list){
            System.out.println(mealList);
        }


    }*/
}
