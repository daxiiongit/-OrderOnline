package com.sunyanxiong.ssm.service.impl;

import com.sunyanxiong.ssm.mapper.AdminMapper;
import com.sunyanxiong.ssm.po.Admin;
import com.sunyanxiong.ssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 代码
 * <p>
 * Created by daxiongit on 2016/5/15 0015.
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findAdmin(Admin admin) throws Exception {
        return adminMapper.findAdmin(admin);
    }
}
