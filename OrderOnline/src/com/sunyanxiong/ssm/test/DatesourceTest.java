package com.sunyanxiong.ssm.test;

import com.sunyanxiong.ssm.mapper.AdminMapper;
import com.sunyanxiong.ssm.mapper.MealseriesMapper;
import com.sunyanxiong.ssm.po.Admin;
import com.sunyanxiong.ssm.po.Mealseries;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Description: 测试数据
 * <p>
 * Created by daxiongit on 2016/5/15 0015.
 */
public class DatesourceTest {

    private ApplicationContext applicationContext;

    @Before
    public void before(){

        // 读取spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext-*.xml");

    }

    // 测试查询管理员信息
    @Test
    public void testFindAdmin() throws Exception {
        AdminMapper adminMapper = (AdminMapper) applicationContext.getBean("adminMapper");
        Admin admin = adminMapper.findAdmin(new Admin());
        System.out.println(admin);
    }
    // 测试查询菜系列表
    @Test
    public void testFindMealseries() throws Exception {
        MealseriesMapper mealseriesMapper = (MealseriesMapper) applicationContext.getBean("mealseriesMapper");

       /* Mealseries mealseries = new Mealseries();
        mealseries.setSeriesname("土");*/

       List<Mealseries>  mealseriestest = mealseriesMapper.findMealseries(null);
        System.out.println(mealseriestest);
    }

}
