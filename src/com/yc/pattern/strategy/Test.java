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

		// 红头鸭
		showDuckInfo(new RedHeadDuck());
		showLine();

		// 橡皮鸭
		showDuckInfo(new RubberDuck());
		showLine();

		// 模型鸭
		showDuckInfo(new ModelDuck());
		showLine();

		//诱饵鸭
		showDuckInfo(new DecoyDuck());
		showLine();

		//野鸭
		showDuckInfo(new MallardDuck());
		showLine();
	}


	public static void showDuckInfo(Duck duck){
		duck.fly();
		duck.quack();
		duck.display();
	}

	public static void showLine(){
		System.out.println();
		System.out.println("----------------");
		System.out.println();
	}
}
