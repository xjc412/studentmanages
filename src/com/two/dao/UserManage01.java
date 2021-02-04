package com.two.dao;

import com.two.entity.User;

import java.util.List;

public interface UserManage01 {
    public List<User> allUser();
    public int add(Object[] obj);
    public int del(Object[] obj);
    public int alter(Object[] obj);
}
