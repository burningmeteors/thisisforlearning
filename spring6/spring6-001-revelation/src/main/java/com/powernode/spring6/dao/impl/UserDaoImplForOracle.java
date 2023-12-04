package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

public class UserDaoImplForOracle implements UserDao {
    /**
     *
     */
    @Override
    public void deleteById() {
        System.out.println("oracle数据库正在删除用户信息");
    }
}
