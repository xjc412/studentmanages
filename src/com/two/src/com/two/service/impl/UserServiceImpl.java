<<<<<<< 43ee7956e769008acd76d73d342e35dcd44ae347
package com.two.service.impl;

import com.two.dao.impl.UserDaoImpl;
import com.two.entity.User;
import com.two.service.UserService;

public class UserServiceImpl implements UserService {
    public User loginSelect(String userName, String password) {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.loginSelect(userName, password);
        return user;
    }

    @Override
    public int register(String userName, String password, String level) {
        UserDaoImpl userDao = new UserDaoImpl();
        int i = userDao.register(userName, password, level);
        return i;
    }
}
=======
package com.two.service.impl;

import com.two.dao.impl.UserDaoImpl;
import com.two.entity.User;
import com.two.service.UserService;

public class UserServiceImpl implements UserService {
    public User loginSelect(String userName, String password) {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.loginSelect(userName, password);
        return user;
    }

    @Override
    public int register(String userName, String password, String level) {
        UserDaoImpl userDao = new UserDaoImpl();
        int i = userDao.register(userName, password, level);
        return i;
    }
}
>>>>>>> 韩松的提交
