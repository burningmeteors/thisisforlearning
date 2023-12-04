package com.powernode.spring6.service;

import com.powernode.spring6.dao.OrderDao;

/**
 * @Classname OrderService
 * @Description notiong
 * @Date 2023/12/4 12:39
 * @Created by 成熟男涛儿
 */
public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    public void save(){
        orderDao.inset();
    }
}
