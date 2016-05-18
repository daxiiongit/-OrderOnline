package com.sunyanxiong.ssm.controller;

import com.sunyanxiong.ssm.po.Admin;
import com.sunyanxiong.ssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/15 0015.
 */

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    // 进入登录页面
    @RequestMapping(value = "/toLogin")
    public String toLogin() throws Exception{
        return "admin/login";
    }

    // 跳转到第一中登录方式页面
    @RequestMapping(value = "/toLoginFirst")
    public String toLoginFirst() throws Exception{
        return "admin/login1";
    }

    // 登录成功后
    @RequestMapping(value = "/loginAdmin")
    public String loginAdmin(HttpSession session,
                             @RequestParam(value = "loginname") String loginname,
                             @RequestParam(value = "loginpwd") String loginpwd) throws Exception{

        Admin admin = new Admin();
        admin.setLoginname(loginname);
        admin.setLoginpwd(loginpwd);

        System.out.println(admin);

        // 查询结果
        Admin confirmAdmin = adminService.findAdmin(admin);
        System.out.println(confirmAdmin);
        // 判断数据库中是否存在
        if (confirmAdmin != null) {
            session.setAttribute("loginname",loginname);
            return "admin/main";
        }
        return "admin/login1";
    }

    // 退出登录
    @RequestMapping("/logout")
    public String logoutAdmin(HttpSession session){
        session.invalidate();
        return "admin/login";
    }
}
