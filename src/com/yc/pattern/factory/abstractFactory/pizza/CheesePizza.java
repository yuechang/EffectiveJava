package com.yc.pattern.factory.abstractFactory.pizza;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	/**
	 * 要制作披萨，需要工厂提供原料。
	 * 所以每个披萨类都需要从构造器参数中得到一个工厂，
	 * 并把这个工厂存储在一个实例变量中。
	 * @param ingredientFactory
	 */
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/**
	 * prepare()方法一步一步地创建芝士披萨，
	 * 每当需要原料时，就跟工厂要。
	 * sauce：把Pizza的实例变量设置为此披萨所使用的某种酱料
	 * ingredientFactory：这是原料工厂，Pizza不在乎使用什么工厂，只要是原料工厂就行
	 * createSauce()：这个方法会返回这个区域所使用的酱料。
	 */
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
