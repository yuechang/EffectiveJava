/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.strategy;

/**
* @ClassName: ModelDuck
* @Description: 模型鸭
* @author Yue Chang 
* @date 2017年5月8日 下午5:00:01 
* @since 1.0
*/
public class ModelDuck extends Duck {

    /**
     * 不会飞，呱呱叫
     */
	public ModelDuck() {
		super.flyBehavior = new FlyNoWay();
		super.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
