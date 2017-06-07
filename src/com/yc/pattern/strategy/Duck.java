/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.strategy;

/**
 * @ClassName: Duck
 * @Description: 鸭子超类
 * @author Yue Chang
 * @date 2017年5月8日 下午4:06:08
 * @since 1.0
 */
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	// 不同的鸭子长相不同，具体实现交给子类
	public abstract void display();

	// 将飞行行为委托给飞行行为类处理
	public void fly() {
		flyBehavior.fly();
	}

	// 将呱呱叫行为委托给呱呱叫行为类处理
	public void quack() {
		quackBehavior.quack();
	}

	// 所有的鸭子都会浮水
	public void swin() {

		System.out.println("swin");
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	// 动态设置飞行行为
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
