package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMySql;
import com.powernode.spring6.dao.impl.UserDaoImplForOracle;
import com.powernode.spring6.service.UserService;

public class UserServiceImpl implements UserService {
    /**
     *
     */
//    private  UserDao userDao = new UserDaoImplForMySql();
    private  UserDao userDao = new UserDaoImplForOracle();
    @Override
    public void deleteUser() {
        userDao.deleteById();

    }
}
