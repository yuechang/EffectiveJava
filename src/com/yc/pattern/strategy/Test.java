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
* @ClassName: Test
* @Description: 测试
* @author Yue Chang 
* @date 2017年5月8日 下午5:11:31 
* @since 1.0
*/
public class Test {

	public static void main(String[] args) {
		
		FlyBehavior flyWithWings = new FlyWithWings();
		QuackBehavior quack = new Quack();
		RedHeadDuck redHeadDuck = new RedHeadDuck(flyWithWings,quack);
		redHeadDuck.fly();
		redHeadDuck.quack();
		redHeadDuck.display();

		System.out.println();
		System.out.println("----------------");
		System.out.println();

		FlyBehavior flyNoWay = new FlyNoWay();
		ModelDuck modelDuck = new ModelDuck(flyNoWay,quack);
		modelDuck.fly();
		modelDuck.quack();
		modelDuck.display();
		
	}
}
