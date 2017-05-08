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
* @ClassName: Quack
* @Description: 呱呱叫
* @author Yue Chang 
* @date 2017年5月8日 下午4:24:46 
* @since 1.0
*/
public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
