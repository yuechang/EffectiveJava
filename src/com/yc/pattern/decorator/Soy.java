/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator;

/**
 * @author Yue Chang
 * @ClassName: Soy
 * @Description: 豆浆
 * @date 2017/7/17 14:44
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 豆浆";
    }

    @Override
    public double cost() {

        double cost = 0;
        //System.out.println("豆浆 className:"+beverage.getClass().getName() + ",size:" + beverage.getSize());
        String beverageSize = beverage.getSize();
        if(VENTI_SIZE.equals(beverageSize)){
            cost = 0.25;
        } else if(GRANDE_SIZE.equals(beverageSize)){
            cost = 0.2;
        } else {
            cost = 0.15;
        }
        return cost + beverage.cost();
    }
}
