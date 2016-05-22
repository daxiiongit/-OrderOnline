package com.sunyanxiong.ssm.test;

import com.sunyanxiong.ssm.mapper.AdminMapper;
import com.sunyanxiong.ssm.mapper.MealMapper;
import com.sunyanxiong.ssm.mapper.MealseriesMapper;
import com.sunyanxiong.ssm.mapper.OrdersMapper;
import com.sunyanxiong.ssm.po.*;
import com.sunyanxiong.ssm.vo.OrdersVo;
import com.sunyanxiong.ssm.vo.QueryVo;
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
    public void before() {

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

        List<Mealseries> mealseriesList = mealseriesMapper.findMealseries(null);
        for (Mealseries ms : mealseriesList) {
            System.out.println(ms.getSeriesname());
        }
    }

    // 测试更新菜系UpdateMealseries
    // 测试查询菜系列表
    @Test
    public void testUpdateMealseries() throws Exception {
        MealseriesMapper mealseriesMapper = (MealseriesMapper) applicationContext.getBean("mealseriesMapper");

        MealseriesCustom mealseriesCustom = new MealseriesCustom();
        mealseriesCustom.setId(1);
        mealseriesCustom.setSeriesname("猪肉");

        mealseriesMapper.updateMealseries(mealseriesCustom);
    }

    // 测试新增菜系
    @Test
    public void testSaveMealseries() throws Exception {
        MealseriesMapper mealseriesMapper = (MealseriesMapper) applicationContext.getBean("mealseriesMapper");
        mealseriesMapper.saveMealseries("卤肉");
    }

    // 根据id查找菜系
    @Test
    public void testFindMealseriesById() throws Exception {
        MealseriesMapper mealseriesMapper = (MealseriesMapper) applicationContext.getBean("mealseriesMapper");
        MealseriesCustom mealseriesCustom = mealseriesMapper.findMealseriesById(2);
        System.out.println(mealseriesCustom.getSeriesname());
    }

    // 根据id删除菜系
    @Test
    public void testDeleteMealseries() throws Exception {
        MealseriesMapper mealseriesMapper = (MealseriesMapper) applicationContext.getBean("mealseriesMapper");
        mealseriesMapper.deleteMealseries(1);
    }

    // 查询菜品列表
    @Test
    public void testFindAllMeal() throws Exception {
        MealMapper mealMapper = (MealMapper) applicationContext.getBean("mealMapper");
        List<MealCustom> mealList = mealMapper.findAllMeal();
        for (MealCustom list : mealList) {
            System.out.println(list.getMealseriesCustom().getSeriesname());
        }

    }

    // 测试新增菜品
    @Test
    public void testSaveMeal() throws Exception {

        MealMapper mealMapper = (MealMapper) applicationContext.getBean("mealMapper");
        MealCustom mealCustom = new MealCustom();
        mealCustom.setMealname("青菜");
        /*MealseriesCustom mealseriesCustom = new MealseriesCustom();
        mealseriesCustom.setId(1);
        mealCustom.setMealseriesCustom(mealseriesCustom);*/
        mealCustom.setMealseriesid(2);
        mealCustom.setMealdescription("芹菜很好吃");
        mealCustom.setMealsummarize("没有描述");
        mealCustom.setMealprice(2.5);
        mealCustom.setMealimage("fafadsfdasf");

        // 保存
        mealMapper.saveMeal(mealCustom);
    }

    // 查询订单信息
    @Test
    public void testFindAllOrders() throws Exception{
        OrdersMapper ordersMapper = (OrdersMapper) applicationContext.getBean("ordersMapper");

        OrdersVo ordersVo = new OrdersVo();
        ordersVo.setOrdersList(ordersMapper.findAllOrders());
//        List<Orders> ordersList = ordersMapper.findAllOrders();

        System.out.println(ordersVo);
       // System.out.println(ordersVo.getOrdersList());

        for (Orders os : ordersVo.getOrdersList()){
            System.out.println(os);
        }
    }

    // 修改订单状态
    @Test
    public void testAlertState() throws Exception {
        OrdersMapper ordersMapper = (OrdersMapper) applicationContext.getBean("ordersMapper");
        Orders orders = new Orders();
        orders.setId(1);
        orders.setOrderstate(3);

        ordersMapper.alertState(orders);
    }

    // 测试查询订单详情
    @Test
    public void testFindAllOrderdts()throws Exception{
        OrdersMapper ordersMapper = (OrdersMapper) applicationContext.getBean("ordersMapper");
        List<OrderdtsCustom> orderdtsCustomList = ordersMapper.findAllOrderdts(1);
        System.out.println(orderdtsCustomList);
    }

}
