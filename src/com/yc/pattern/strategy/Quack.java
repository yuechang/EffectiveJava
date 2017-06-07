/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
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
