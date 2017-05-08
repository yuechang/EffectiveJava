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
* @ClassName: FlyNoWay
* @Description: 不会飞行为
* @author Yue Chang 
* @date 2017年5月8日 下午4:23:03 
* @since 1.0
*/
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
