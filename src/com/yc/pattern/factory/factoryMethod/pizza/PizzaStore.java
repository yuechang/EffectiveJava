/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod.pizza;

/**
 * @author Yue Chang
 * @ClassName: PizzaStore
 * @Description: 披萨商店
 * @date 2017/7/14 22:26
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    /**
     * abstract：工厂方法是抽象的，所以依赖子类来处理对象的创建。
     * Pizza：工厂方法必须返回一个产品。超类中定义的方法，通常使用到工厂方法的返回值。
     * createPizza：工厂方法将客户与实际创建产品的代码分割开来。
     * type：工厂方法可能需要参数
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}

