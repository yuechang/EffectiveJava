/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
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
