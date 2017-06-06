/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factory.simpleFactory;

/**
 * @ClassName: Strawberry
 * @Description: 草莓类
 * @author Yue Chang
 * @date 2016年3月15日 下午10:39:41
 * 
 */
public class Strawberry implements Fruit {

	/**
	 * 生长
	 */
	@Override
	public void grow() {
		System.out.println("Strawberry is growing...");
	}

	/**
	 * 收获
	 */
	@Override
	public void harvest() {
		System.out.println("Strawberry has been harvested.");
	}

	/**
	 * 种植
	 */
	@Override
	public void plant() {
		System.out.println("Strawberry has been planted.");
	}

}
