/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.coffee;

import com.yc.pattern.decorator.coffee.Beverage;
import com.yc.pattern.decorator.coffee.CondimentDecorator;

/**
 * @author Yue Chang
 * @ClassName: Mocha
 * @Description: 摩卡
 * @date 2017/7/17 14:27
 */
public class Mocha extends CondimentDecorator {

    // 用一个实例变量记录饮料，也就是被装饰者
    Beverage beverage;

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    // 想办法让被装饰者(饮料)被记录到实例变量中。
    // 这里的做法是：把饮料当做构造器的参数，
    // 再由构造器将此饮料记录在实例变量中。
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    // 除了饮料描述之外，我们还希望加上附加的描述(例如：摩卡)
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 摩卡";
    }

    // 要计算带摩卡饮料的价格，首先吧调用类托给被装饰对象，以计算加钱，
    // 然后再加上摩卡的价格，得到最后结果
    @Override
    public double cost() {
        double cost = 0;

        String beverageSize = beverage.getSize();
        // System.out.println("摩卡 className:"+beverage.getClass().getName() + ",beverageSize:" + beverageSize );
        if(VENTI_SIZE.equals(beverageSize)){
            cost = 0.3;
        } else if(GRANDE_SIZE.equals(beverageSize)){
            cost = 0.25;
        } else {
            cost = 0.2;
        }
        return cost + beverage.cost();
    }

}
