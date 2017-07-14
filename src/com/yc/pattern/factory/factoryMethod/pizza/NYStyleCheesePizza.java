/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod.pizza;

/**
 * @author Yue Chang
 * @ClassName: NYStyleCheesePizza
 * @Description: TODO
 * @date 2017/7/14 22:49
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        name = "纽约披萨";
        dough = "薄外壳面团";
        sauce = "大蒜番茄酱";

        toppings.add("意大利Reggiano高级干酪");
    }
}

