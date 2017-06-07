/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.adapter;

import java.util.Random;

/**
 * @author Yue Chang
 * @ClassName: DuckAdapter
 * @Description: 火鸡适配器
 * @date 2017/6/7 22:08
 */
public class DuckAdapter implements Turkey {

    private Duck duck;
    private Random random = new Random();

    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void fly() {
        int i = random.nextInt(5);
        if(i > 0){
            duck.fly();
        }
    }

    @Override
    public void gobble() {
        duck.quack();
    }
}
