/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod.pizza;

/**
 * @author Yue Chang
 * @ClassName: PizzaTestDrive
 * @Description: 披萨测试类
 * @date 2017/7/14 23:04
 */
public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan 预定了一个" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel 预定了一个" + pizza.getName() + "\n");
    }
}

