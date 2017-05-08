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
* @ClassName: FlyWithWings
* @Description: 用翅膀飞行为
* @author Yue Chang 
* @date 2017年5月8日 下午4:20:02 
* @since 1.0
*/
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}
