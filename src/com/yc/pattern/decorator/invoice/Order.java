/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.invoice;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Vector;

/**
 * @author Yue Chang
 * @ClassName: Order
 * @Description: 抽象订单类
 * @date 2018/5/24 10:36
 */
public abstract class Order {

    private   OrderLine lnkOrderLine;
    protected String customerName;      // 客户名
    protected Date salesDate;           // 销售日期
    protected Vector<OrderLine> items = new Vector(10);

    public void print() {
        for (OrderLine item : items) {
            item.printLine();
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    // 增加一行销售产品
    public void addItem(OrderLine item) {
        items.add(item);
    }

    // 删除一行销售产品
    public void removeItem(OrderLine item) {
        items.remove(item);
    }

    public double getGrandTotal() {

        double amnt = 0.0D;
        for (OrderLine item : items) {
            amnt +=item.getSubtotal();
        }
        return amnt;
    }

    protected String formatCurrency(double amnt) {
        return NumberFormat.getCurrencyInstance().format(amnt);
    }
}
