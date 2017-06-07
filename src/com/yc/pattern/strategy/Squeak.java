/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.strategy;

/**
* @ClassName: Squeak
* @Description: 吱吱叫
* @author Yue Chang 
* @date 2017年5月8日 下午4:28:50 
* @since 1.0
*/
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}
