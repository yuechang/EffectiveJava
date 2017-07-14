/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod.pizza;

/**
 * @author Yue Chang
 * @ClassName: NYPizzaStore
 * @Description: TODO
 * @date 2017/7/14 22:37
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        return new NYStyleCheesePizza();
    }
}

