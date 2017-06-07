/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
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
