/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.builder;

/**
 * @author Yue Chang
 * @ClassName: CocaCola
 * @Description: 可口可乐类
 * @date 2017/6/8 19:43
 */
public class CocaCola {

    private NutritionFacts nutritionFacts;

    public CocaCola() {}

    public CocaCola(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    @Override
    public String toString() {
        return "CocaCola{" +
                "nutritionFacts=" + nutritionFacts +
                '}';
    }
}
