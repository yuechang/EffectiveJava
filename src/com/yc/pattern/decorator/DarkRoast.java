/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator;

/**
 * @author Yue Chang
 * @ClassName: DarkRoast
 * @Description: 焦炒咖啡
 * @date 2017/7/17 14:59
 */
public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "焦炒咖啡";
    }



    @Override
    public double cost() {
        return 0.99;
    }
}
