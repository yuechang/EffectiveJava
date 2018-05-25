/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.invoice;

/**
 * @author Yue Chang
 * @ClassName: OrderDecorator
 * @Description: 订单装饰器类
 * @date 2018/5/24 10:55
 */
public class OrderDecorator extends Order {

    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
        this.setSalesDate(order.getSalesDate());
        this.setCustomerName(order.getCustomerName());
    }

    public void print() {
        super.print();
    }
}
