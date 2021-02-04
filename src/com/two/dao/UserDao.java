package com.two.dao;

import com.two.entity.User;

public interface UserDao {
    public User loginSelect(String userName, String password);
    public int register(String userName, String password, String level);
}
