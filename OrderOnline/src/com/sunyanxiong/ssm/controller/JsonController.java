package com.sunyanxiong.ssm.controller;

import com.sunyanxiong.ssm.po.Json;
import com.sunyanxiong.ssm.po.Meal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description: json数据交互
 * <p>
 * Created by daxiongit on 2016/5/29 0029.
 */

@Controller
public class JsonController {

    /*  请求json，输出json
    *   @RequestBody:将json数据转换为java对象
    *   @ResponseBody:将java转换为json串数据
    * */

    @RequestMapping("/requestJson")
    public @ResponseBody Json requestJson(@RequestBody Json json){
        return json;
    }

    @RequestMapping(value = "/responseJson")
    public @ResponseBody Json responseJson(Json json){
        return json;
    }


}
