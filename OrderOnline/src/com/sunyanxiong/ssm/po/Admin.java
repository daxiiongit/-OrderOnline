package com.sunyanxiong.ssm.po;

/**
 * Description: 管理员类
 * <p>
 * Created by daxiongit on 2016/5/15 0015.
 */
public class Admin {

    private int id;
    private String loginname;
    private String loginpwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                '}';
    }
}
