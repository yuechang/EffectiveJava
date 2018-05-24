/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.invoice;


/**
 * @author Yue Chang
 * @ClassName: FooterDecorator
 * @Description: 订单底部打印装饰器类
 * @date 2018/5/24 10:58
 */
public class FooterDecorator extends OrderDecorator{

    public FooterDecorator(Order order) {
        super(order);
    }

    public void print() {
        super.order.print();
        printFooter();
    }

    private void printFooter() {
        System.out.println("=========================================");
        System.out.println("Total\t\t\t\t\t\t\t" + formatCurrency(super.order.getGrandTotal()));
    }
}
