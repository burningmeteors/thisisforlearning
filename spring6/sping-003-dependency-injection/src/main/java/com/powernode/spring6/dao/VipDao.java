package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname VipDao
 * @Description noting
 * @Date 2023/12/4 11:49
 * @Created by 成熟男涛儿
 */
public class VipDao {
    public  static final Logger logger = LoggerFactory.getLogger(VipDao.class);
    public  void insert(){
        logger.info("正在保存vip用户信息");
    }
}
