/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.template;

/**
* @ClassName: Coffee
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Yue Chang 
* @date 2017年5月8日 下午2:13:07 
* @since 1.0
*/
public class Coffee extends CoffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

}
