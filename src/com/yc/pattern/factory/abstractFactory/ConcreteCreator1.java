/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.abstractFactory;

/**
 * @ClassName: ConcreteCreator1
 * @Description: 具体工厂类ConcreteCreator1
 * @author Yue Chang
 * @date 2016年3月17日 下午3:11:30
 *  
 */
public class ConcreteCreator1 implements Creator {

	/**
	 * 
	 * 产品等级结构A的工厂方法
	 */
	@Override
	public ProductA factoryA() {
		return new ProductA1();
	}

	/**
	 * 
	 * 产品等级结构B的工厂方法
	 */
	@Override
	public ProductB factoryB() {
		return new ProductB1();
	}

}
