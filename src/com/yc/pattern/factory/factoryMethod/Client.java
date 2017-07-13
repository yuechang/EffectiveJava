/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod;

/** 
 * @ClassName: Client 
 * @Description: 测试类
 * @author Yue Chang
 * @date 2016年3月16日 下午10:54:49 
 */
public class Client {
	
	public static void main(String[] args) {
		Creator creator1 = new ConcreteCreator1();
		Creator creator2 = new ConcreteCreator2();

		Product prod1 = creator1.factory();
		Product prod2 = creator2.factory();
	}
}
