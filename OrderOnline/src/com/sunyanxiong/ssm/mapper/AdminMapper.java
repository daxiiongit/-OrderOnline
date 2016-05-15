package com.sunyanxiong.ssm.mapper;

import com.sunyanxiong.ssm.po.Admin;

/**
 * Description: 管理员相关接口
 * <p>
 * Created by daxiongit on 2016/5/15 0015.
 */
public interface AdminMapper {

    Admin findAdmin(Admin admin) throws Exception;  // 验证管理员信息

}
