/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod.pizza;

/**
 * @author Yue Chang
 * @ClassName: ChicagoPizzaStore
 * @Description: TODO
 * @date 2017/7/14 23:03
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return new ChicagoStyleCheesePizza();
    }
}

