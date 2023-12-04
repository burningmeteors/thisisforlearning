package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

public class UserDaoImplForMySql implements UserDao {


    /**
     *
     */
    @Override
    public void deleteById() {
        System.out.println("MySQL正在删除用户信息……");
    }
}
