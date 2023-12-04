package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname Order
 * @Description noting
 * @Date 2023/12/4 12:34
 * @Created by 成熟男涛儿
 */
public class OrderDao {
   private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);
    public void inset(){
        logger.info("正在生成订单");
    }

}
