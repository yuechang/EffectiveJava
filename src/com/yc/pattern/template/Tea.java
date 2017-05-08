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
package com.yc.pattern.template;

/**
* @ClassName: Tea
* @Description: 茶类
* @author Yue Chang 
* @date 2017年5月8日 下午12:21:20 
* @since 1.0
*/
public class Tea extends CoffeineBeverage {

	// 冲泡茶叶
	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	// 加入茶的调味品
	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
