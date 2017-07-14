/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod.pizza;

/**
 * @author Yue Chang
 * @ClassName: ChicagoStyleCheesePizza
 * @Description: TODO
 * @date 2017/7/14 22:54
 */
public class ChicagoStyleCheesePizza extends Pizza {


    public ChicagoStyleCheesePizza() {

        name = "芝加哥披萨";
        dough = "厚面团";
        sauce = "小番茄酱";

        toppings.add("意大利白干酪");
    }

    @Override
    public void box() {
        System.out.println("将披萨切成正方形");
    }
}

