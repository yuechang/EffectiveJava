/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod;

/** 
 * @ClassName: ConcreteCreator2 
 * @Description: 实际的产品2创建者
 * @author Yue Chang
 * @date 2016年3月16日 下午10:50:35 
 *  
 */
public class ConcreteCreator2 implements Creator {

	/*
	 * 工厂方法
	 */
	@Override
	public Product factory() {
		return new ConcreteProduct2();
	}

	
}
