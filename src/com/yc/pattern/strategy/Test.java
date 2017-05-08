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
* @ClassName: MiniDuckSimulator
* @Description: TODO(这里用一句话描述这个类的作用)
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
		
		
		
		
	}
}
