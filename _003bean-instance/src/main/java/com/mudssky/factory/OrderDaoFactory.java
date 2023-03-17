package com.mudssky.factory;

import com.mudssky.dao.OrderDao;
import com.mudssky.dao.impl.OrderDaoImpl;

/**
 * @author mudssky
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("order factory");
        return new OrderDaoImpl();
    }
}
