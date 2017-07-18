/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator;

/**
 * @author Yue Chang
 * @ClassName: Beverage
 * @Description: 饮料抽象类
 * @date 2017/7/17 12:14
 */
public abstract class Beverage {

    /* 小杯 */
    public static final String TALL_SIZE = "tall";
    /* 中杯 */
    public static final String GRANDE_SIZE = "grande";
    /* 大杯 */
    public static final String VENTI_SIZE = "venti";

    // 默认为小杯
    private String size;

    public String getDescription() {
        return "未知饮料";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract double cost();


    @Override
    public String toString() {

        String sizeStr = null;
        if (GRANDE_SIZE.equals(getSize())) {
            sizeStr = "中杯";
        } else if (VENTI_SIZE.equals(getSize())) {
            sizeStr = "大杯";
        } else {
            sizeStr = "小杯";
        }
        return getDescription() + ", " + sizeStr + " $ " + cost();
    }
}
