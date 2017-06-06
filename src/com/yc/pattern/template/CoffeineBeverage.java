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
* @ClassName: CoffeineBeverage
* @Description: 咖啡因饮料类
* @author Yue Chang 
* @date 2017年5月8日 下午12:14:17 
* @since 1.0
*/
public abstract class CoffeineBeverage {

	// 煮沸水
	void boilWater(){
		System.out.println("Boiling water");
	}
	
	// 放入杯子
	public void pourInCup(){
		System.out.println("Pouring into cup");
	}

	// 冲泡
	abstract void brew();
	
	// 加入调味品
	abstract void addCondiments();

	public void getCoffeineBeverage(){
		boilWater();
		pourInCup();
		brew();
		addCondiments();
	}
}
