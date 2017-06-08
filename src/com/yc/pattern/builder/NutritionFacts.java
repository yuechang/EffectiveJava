/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.builder;

/**
 * @ClassName: NutritionFacts
 * @Description: 营养成分类
 * @author Yue Chang
 * @date 2016年3月10日 下午10:42:07
 */
public class NutritionFacts {

    // 必须指定的值
    // 食品含量
	private int servingSize;
    // 几人份
	private int servings;

    // 可选参数，将用默认值初始化
    //卡路里
	private int calories;
    //脂肪
	private int fat;
    //钠
	private int sodium;
    //碳水化合物
	private int carbohydrate;

    public NutritionFacts(int servingSize, int servings){
        this.servingSize = servingSize;
        this.servings = servings;
    }

	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

    @Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}
}