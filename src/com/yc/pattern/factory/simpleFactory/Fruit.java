/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factory.simpleFactory;

/**
 * @ClassName: Fruit
 * @Description: 水果接口
 * @author Yue Chang
 * @date 2016年3月15日 下午10:25:05
 * 
 */
public interface Fruit {

	/**
	 * 生长
	 */
	void grow();

	/**
	 * 
	 * 收获
	 */
	void harvest();

	/**
	 * 种植
	 */
	void plant();
}
