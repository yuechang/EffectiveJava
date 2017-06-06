/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factory.abstractFactory;

/** 
 * @ClassName: Creator 
 * @Description: 抽象工厂类
 * @author yuechang yuechang@primeton.com 
 * @date 2016年3月17日 下午3:07:39 
 *  
 */
public interface Creator {

	/**
	 * 
	 * 产品等级结构A的工厂方法
	 */
	public ProductA factoryA();
	
	/**
	 * 
	 * 产品等级结构B的工厂方法
	 */
	public ProductB factoryB();
}
