/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator;

/**
 * @author Yue Chang
 * @ClassName: Espresso
 * @Description: 浓缩咖啡
 * @date 2017/7/17 12:21
 */
public class Espresso extends Beverage{

    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }

    // 返回浓缩咖啡的价格
    @Override
    public double cost() {
        return 1.99;
    }
}
