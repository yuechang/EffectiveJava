/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.invoice;

import java.text.NumberFormat;

/**
 * @author Yue Chang
 * @ClassName: OrderLine
 * @Description: 货品信息类
 * @date 2018/5/24 10:44
 */
public class OrderLine {

    private String itemName;    // 产品名称
    private int units;          // 数目
    private double unitPrice;   // 单脚

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // 小计金额的取值方法
    public double getSubtotal() {
        return unitPrice * units;
    }

    // 工具方法，将金额格式化
    private String formatCurrent(double amnt) {
        return NumberFormat.getCurrencyInstance().format(amnt);
    }

    public void printLine() {
        System.out.println(
                itemName + "\t" + units
                + "\t" + formatCurrent(unitPrice)
                + "\t\t" + formatCurrent(getSubtotal()));
    }
}
