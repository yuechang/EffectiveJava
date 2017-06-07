/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.strategy;

/**
* @ClassName: MuteQuack
* @Description: 不会叫
* @author Yue Chang 
* @date 2017年5月8日 下午4:30:42 
* @since 1.0
*/
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("mute quack");
	}
}
