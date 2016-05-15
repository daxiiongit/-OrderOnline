package com.sunyanxiong.ssm.service;

import com.sunyanxiong.ssm.po.Admin;

/**
 * Description: 管理员验证接口
 * <p>
 * Created by daxiongit on 2016/5/15 0015.
 */
public interface AdminService {

    Admin findAdmin(Admin admin) throws Exception;  // 验证管理员信息

}
