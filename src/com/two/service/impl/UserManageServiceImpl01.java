package com.two.service.impl;

import com.two.dao.UserManage01;
import com.two.dao.impl.UserManageImpl01;
import com.two.entity.User;
import com.two.service.UserManageService01;

import java.util.List;

public class UserManageServiceImpl01 implements UserManageService01 {
    private static UserManage01 user = new UserManageImpl01();

    @Override
    public List<User> allUser() {
        List<User> users = user.allUser();
        return users;
    }

    @Override
    public int add(Object[] obj) {
        return user.add(obj);
    }

    @Override
    public int del(Object[] obj) {
        return user.del(obj);
    }

    @Override
    public int alter(Object[] obj) {
        return user.alter(obj);
    }
}
