/*
 * Copyright (c) 2016, 2025, HHLY and/or its affiliates. All rights reserved.
 * HHLY PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.yc.pattern.strategy;

/**
 * @ClassName: RubberDuck
 * @Description: 橡皮鸭
 * @author Yue Chang
 * @date 2017年5月8日 下午4:50:29
 * @since 1.0
 */
public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a RubberDuck");
    }

    public RubberDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Squeak();
    }
}
