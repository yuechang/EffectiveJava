/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
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
