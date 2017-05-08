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
* @ClassName: FakeQuack
* @Description: 假叫
* @author Yue Chang 
* @date 2017年5月8日 下午4:26:36 
* @since 1.0
*/
public class FakeQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Fake Quack");
	}

}
