/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factoryMethod;

/**
 * @ClassName: ConcreteCreator1
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yuechang yuechang@primeton.com
 * @date 2016年3月16日 下午10:46:18
 * 
 */
public class ConcreteCreator1 implements Creator {

	/*
	 * 工厂方法
	 */
	@Override
	public Product factory() {
		return new ConcreateProduct1();
	}

}
