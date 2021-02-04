package com.two.service;

import com.two.entity.User;

public interface UserService {
    public User loginSelect(String userName, String password);
    public int register(String userName, String password, String level);
}
