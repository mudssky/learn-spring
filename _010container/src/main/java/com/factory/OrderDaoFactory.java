package com.factory;

import com.dao.OrderDao;
import com.dao.impl.OrderDaoImpl;

/**
 * @author mudssky
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("order factory");
        return new OrderDaoImpl();
    }
}
