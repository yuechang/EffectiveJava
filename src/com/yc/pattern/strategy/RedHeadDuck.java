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
* @ClassName: RedHeadDuck
* @Description: 后头鸭
* @author Yue Chang 
* @date 2017年5月8日 下午4:50:29 
* @since 1.0
*/
public class RedHeadDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a red headed duck");
	}
	
	public RedHeadDuck(){}
	
	public RedHeadDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
		super.flyBehavior = flyBehavior;
		super.quackBehavior = quackBehavior;
	}
}
