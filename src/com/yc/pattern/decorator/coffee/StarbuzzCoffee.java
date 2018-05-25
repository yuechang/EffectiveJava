/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.coffee;

/**
 * @author Yue Chang
 * @ClassName: StarbuzzCoffee
 * @Description: 星巴克咖啡测试类
 * @date 2017/7/17 14:50
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {

        // 订一杯浓缩咖啡
        Beverage beverage = new Espresso();
        System.out.println(beverage);
        System.out.println();

        // 订一杯带双倍摩卡及奶泡的烘烤咖啡
        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.GRANDE_SIZE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);
        System.out.println();

        // 订一杯带有豆浆、摩卡及奶泡的星巴克咖啡
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.VENTI_SIZE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);
    }
}
