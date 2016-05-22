package com.sunyanxiong.ssm.controller;

import com.sunyanxiong.ssm.po.OrderdtsCustom;
import com.sunyanxiong.ssm.service.OrdersService;
import com.sunyanxiong.ssm.vo.OrdersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Description: 订单管理处理方法
 * <p>
 * Created by daxiongit on 2016/5/21 0021.
 */

@Controller
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    // 显示所有订单信息列表
    @RequestMapping(value = "/queryOrders")
    public String queryOrders(Model model) throws Exception{
        OrdersVo ordersVo = new OrdersVo();
        ordersVo.setOrdersList(ordersService.findAllOrders());
        model.addAttribute("ordersVo",ordersVo);
        return "/admin/query_orders";
    }

    // 修改订单状态
    @RequestMapping(value = "/alertState")
    public String alertState(@RequestParam(value = "id") int id,
            @RequestParam(value = "orderstate") int orderstate) throws Exception {

        orderstate = orderstate + 1;
        ordersService.alertState(id,orderstate);
        return "redirect:queryOrders.action";
    }

    // 查看订单详情
    @RequestMapping(value = "/query_orderdts")
    public String queryOrderdts(Model model,@RequestParam(value = "id") int id) throws Exception{
        OrdersVo ordersVo = new OrdersVo();
        ordersVo.setOrderdtsCustomList(ordersService.findAllOrderdts(id));

        model.addAttribute("ordersVo",ordersVo);
        return "/admin/query_orderdts";
    }

}
