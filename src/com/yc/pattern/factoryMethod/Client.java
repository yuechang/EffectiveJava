/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factoryMethod;

/** 
 * @ClassName: Client 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author yuechang yuechang@primeton.com 
 * @date 2016年3月16日 下午10:54:49 
 */
public class Client {

	private static Creator creator1,creator2;
	@SuppressWarnings("unused")
	private static Product prod1,prod2;
	
	public static void main(String[] args) {
		creator1 = new ConcreteCreator1();
		prod1 = creator1.factory();
		
		creator2 = new ConcreteCreator2();
		prod2 = creator2.factory();
	}
}
