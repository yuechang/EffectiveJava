/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.builder;

/**
 * @author Yue Chang
 * @ClassName: NutritionFactsBuilder
 * @Description: 营养成分建造类实现类
 * @date 2017/6/8 19:30
 */
public class NutritionFactsBuilder extends AbstractNutritionFactsBuilder{

    private NutritionFacts nutritionFacts;

    public NutritionFactsBuilder(int servingSize, int servings) {

        this.nutritionFacts = new NutritionFacts(servingSize,servings);
    }

    public NutritionFactsBuilder calories(int val) {
        this.nutritionFacts.setCalories(val);
        return this;
    }

    public NutritionFactsBuilder fat(int val) {
        this.nutritionFacts.setFat(val);
        return this;
    }

    public NutritionFactsBuilder carbohydrate(int val) {
        this.nutritionFacts.setCarbohydrate(val);
        return this;
    }

    public NutritionFactsBuilder sodium(int val) {
        this.nutritionFacts.setSodium(val);
        return this;
    }

    public NutritionFacts build() {
        return this.nutritionFacts;
    }

    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }
}
