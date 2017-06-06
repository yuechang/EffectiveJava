/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factory.simpleFactory;

/**
 * @ClassName: Grape
 * @Description: 葡萄类
 * @author Yue Chang
 * @date 2016年3月15日 下午10:39:00
 * 
 */
public class Grape implements Fruit {

	private boolean seedless;

	/**
	 * 生长
	 */
	@Override
	public void grow() {
		System.out.println("Grape is growing...");
	}

	/**
	 * 收获
	 */
	@Override
	public void harvest() {
		System.out.println("Grape has been harvested.");
	}

	/**
	 * 种植
	 */
	@Override
	public void plant() {
		System.out.println("Grape has been planted.");
	}

	/**
	 * 有无籽的取值方法
	 */
	public boolean isSeedless() {
		return seedless;
	}

	/**
	 * 有无籽的赋值方法
	 */
	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}

}
