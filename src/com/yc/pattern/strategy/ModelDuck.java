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
* @ClassName: ModelDuck
* @Description: 模型鸭
* @author Yue Chang 
* @date 2017年5月8日 下午5:00:01 
* @since 1.0
*/
public class ModelDuck extends Duck {

	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super.flyBehavior = flyBehavior;
		super.quackBehavior = quackBehavior;
	}

	public ModelDuck() {
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
