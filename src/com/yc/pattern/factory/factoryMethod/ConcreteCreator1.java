/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod;

/**
 * @ClassName: ConcreteCreator1
 * @Description: 实际的产品1创建者
 * @author Yue Chang
 * @date 2016年3月16日 下午10:46:18
 * 
 */
public class ConcreteCreator1 implements Creator {

	/*
	 * 工厂方法
	 */
	@Override
	public Product factory() {
		return new ConcreteProduct1();
	}

}
