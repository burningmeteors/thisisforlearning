package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.VipDao;

/**
 * @Classname CustomerService
 * @Description noting
 * @Date 2023/12/4 12:02
 * @Created by 成熟男涛儿
 */
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;

    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }
    public  void  save(){
        userDao.insert();
        vipDao.insert();
    }
}
