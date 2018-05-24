/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.coffee;

import com.yc.pattern.decorator.coffee.Beverage;
import com.yc.pattern.decorator.coffee.CondimentDecorator;

/**
 * @author Yue Chang
 * @ClassName: Whip
 * @Description: 奶泡
 * @date 2017/7/17 14:42
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 奶泡";
    }

    @Override
    public double cost() {
        double cost = 0;
        //System.out.println("奶泡 className:" + beverage.getClass().getName() + ",size:" + beverage.getSize());
        String beverageSize = beverage.getSize();
        if(VENTI_SIZE.equals(beverageSize)){
            cost = 0.2;
        } else if(GRANDE_SIZE.equals(beverageSize)){
            cost = 0.15;
        } else {
            cost = 0.1;
        }
        return cost + beverage.cost();
    }
}
