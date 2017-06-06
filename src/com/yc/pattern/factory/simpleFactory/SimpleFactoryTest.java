/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factory.simpleFactory;

/** 
 * @ClassName: SimpleFactoryTest 
 * @Description: 抽象工厂测试类
 * @author yuechang yuechang@primeton.com 
 * @date 2016年3月15日 下午10:51:14 
 *  
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {
		
		try {
			
			Fruit fruit = null;
			
			fruit = FruitGardener.factory("Apple");
			fruit.plant();
			fruit.grow();
			fruit.harvest();
			
			fruit = FruitGardener.factory("grape");
			fruit.plant();
			fruit.grow();
			fruit.harvest();
			
			fruit = FruitGardener.factory("strawberry");
			fruit.plant();
			fruit.grow();
			fruit.harvest();
		} catch (BadFruitException e) {
			e.printStackTrace();
		}
	}
}
