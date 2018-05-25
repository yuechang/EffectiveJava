/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.invoice;

/**
 * @author Yue Chang
 * @ClassName: HeaderDecorator
 * @Description: 订单头部打印装饰器类
 * @date 2018/5/24 10:58
 */
public class HeaderDecorator extends OrderDecorator {

    // 构造函数
    public HeaderDecorator(Order order) {
        super(order);
    }

    public void print() {
        this.printHeader();
        super.order.print();
    }

    private void printHeader() {

        System.out.println("\t***\tI N V O I C E\t***");
        System.out.println("XYZ Incorporated\nDate of Sale:");
        System.out.println(order.getSalesDate());
        System.out.println("=========================================");
        System.out.println("Item\t\tUnits\tUnitPrice\tSubtotal");
    }
}
