/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.adapter;

/**
 * @author Yue Chang
 * @ClassName: RedHeadDuck
 * @Description: 红头鸭
 * @date 2017/6/7 17:31
 */
public class RedHeadDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
