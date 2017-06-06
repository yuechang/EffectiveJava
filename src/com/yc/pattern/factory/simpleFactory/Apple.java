/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factory.simpleFactory;

/**
 * @ClassName: Apple
 * @Description: 苹果类
 * @author yuechang yuechang@primeton.com
 * @date 2016年3月15日 下午10:28:48
 * 
 */
public class Apple implements Fruit {

	private int treeAge;

	/**
	 * 生长
	 */
	@Override
	public void grow() {
		System.out.println("Apple is growing...");
	}

	/**
	 * 收获
	 */
	@Override
	public void harvest() {
		System.out.println("Apple has been harvested.");
	}

	/**
	 * 种植
	 */
	@Override
	public void plant() {
		System.out.println("Apple has been planted.");
	}

	/**
	 * 树龄的取值方法
	 */
	public int getTreeAge() {
		return treeAge;
	}

	/**
	 * 树龄的赋值方法
	 */
	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

}
