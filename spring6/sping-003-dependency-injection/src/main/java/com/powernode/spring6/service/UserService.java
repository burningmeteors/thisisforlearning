package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.VipDao;

/**
 * @Classname UserServie
 * @Description service
 * @Date 2023/12/2 11:50
 * @Created by 成熟男涛儿
 */
public class UserService {
    private  UserDao userDao;

    //通过构造函数来进行注入

    //    public  void setMySqlUserDao(UserDao xyz) {
//        this.userDao = xyz;
//    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //set注入必须提供一个set方法，spring容器会调用这个set方法给userDao赋值
    public  void saveUser(){
        userDao.insert();

    }
}
