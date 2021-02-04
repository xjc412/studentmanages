package com.two.dao.impl;

import com.two.dao.UserManage01;
import com.two.entity.User;
import com.two.util.BaseDaoUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class UserManageImpl01 extends BaseDaoUtil implements UserManage01 {
    @Override
    public List<User> allUser() {
        String sql = "select * from user ";
        Object[] obj = {};
        try {
            List<User> users = this.selectData(sql, obj, User.class);
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int add(Object[] obj) {
        String sql = "insert into user (username,password,level) values(?,?,?)";
        try {
            int i = this.updateData(sql, obj);
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int del(Object[] obj) {
        String sql = "delete from user where username = ?";
        try {
            int i = this.updateData(sql, obj);
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int alter(Object[] obj) {
        String sql = "update user set username = ? , password = ? , level = ? where username = ?";
        try {
            int i = this.updateData(sql, obj);
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
