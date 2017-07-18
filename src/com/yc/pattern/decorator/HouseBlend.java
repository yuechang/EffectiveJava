/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator;

/**
 * @author Yue Chang
 * @ClassName: HouseBlend
 * @Description: 星巴克咖啡
 * @date 2017/7/17 14:23
 */
public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "星巴克咖啡";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
