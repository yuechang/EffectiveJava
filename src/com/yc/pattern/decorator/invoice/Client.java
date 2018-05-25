/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.invoice;

import java.util.Date;

/**
 * @author Yue Chang
 * @ClassName: Client
 * @Description: 客户端示例
 * @date 2018/5/24 11:33
 */
public class Client {

    private static Order order;

    public static void main(String[] args) {
        order = new SalesOrder();
        order.setSalesDate(new Date());
        order.setCustomerName("XYZ Repair Shop");

        OrderLine orderLine = new OrderLine();
        orderLine.setItemName("FireWheel Tire");
        orderLine.setUnitPrice(154.23);
        orderLine.setUnits(4);
        order.addItem(orderLine);

        OrderLine orderLine2 = new OrderLine();
        orderLine2.setItemName("Front Fender");
        orderLine2.setUnitPrice(300.45);
        orderLine2.setUnits(1);
        order.addItem(orderLine2);

        order = new HeaderDecorator(new FooterDecorator(order));
        order.print();
    }
}
/*

程序输出：
	***	I N V O I C E	***
XYZ Incorporated
Date of Sale:
Thu May 24 11:44:00 CST 2018
=========================================
Item		Units	UnitPrice	Subtotal
FireWheel Tire	4	￥154.23		￥616.92
Front Fender	1	￥300.45		￥300.45
=========================================
Total							￥917.37

 */