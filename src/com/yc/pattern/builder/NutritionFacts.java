/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.builder;

/**
 * @ClassName: NutritionFacts
 * @Description: 营养成分类-建造者设计模式
 * @author yuechang yuechang@primeton.com
 * @date 2016年3月10日 下午10:42:07
 * 
 */
public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder {

		// Required parameters
		private final int servingSize;
		private final int servings;

		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {

			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			this.calories = val;
			return this;
		}

		public Builder fat(int val) {
			this.fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			this.carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			this.sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	
	private NutritionFacts(Builder builder) {

		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}

	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}

	public static void main(String[] args) {
		
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
		System.out.println("cocaCola:"+cocaCola);
	}
}
