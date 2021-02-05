package com.two.dao.impl;

import com.two.dao.UserDao;
import com.two.entity.User;
import com.two.util.BaseDaoUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl extends BaseDaoUtil implements UserDao {
    public User loginSelect(String userName, String password) {
        String sql = "select * from user where username = ? and password = ?";
        Object[] objects = {userName, password};
        User user = null;
        try {
            List<User> list = super.selectData(sql, objects, User.class);
            if (list.size() != 0) {
              user = list.get(0);
            }
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
        return user;
    }

    @Override
    public int register(String userName, String password, String level) {
        String sql = "insert into user(username, password, level) values (?, ?, ?)";
        Object[] objects = {userName, password, level};
        int i = 0;
        try {
            i = super.updateData(sql, objects);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
