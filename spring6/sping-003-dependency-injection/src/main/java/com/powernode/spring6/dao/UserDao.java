package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname UserDao
 * @Description SetInjection
 * @Date 2023/12/2 11:48
 * @Created by 成熟男涛儿
 */
public class UserDao {
    private  static final Logger logger = LoggerFactory.getLogger(UserDao.class);


    public void  insert(){
        //使用log4j2框架
        logger.info("数据库正在保存用户信息");
    }
}

