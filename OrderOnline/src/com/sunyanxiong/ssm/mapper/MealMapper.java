package com.sunyanxiong.ssm.mapper;

import com.sunyanxiong.ssm.vo.QueryVo;

import java.util.List;

/**
 * Description: 查询菜品 dao 接口
 * <p>
 * Created by daxiongit on 2016/5/18 0018.
 */
public interface MealMapper {

    List<QueryVo> findAllMeal () throws Exception;

}
