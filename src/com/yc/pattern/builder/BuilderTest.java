/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.builder;

/**
 * @author Yue Chang
 * @ClassName: BuilderTest
 * @Description: 建造者测试客户端
 * @date 2017/6/8 19:35
 */
public class BuilderTest {

    public static void main(String[] args) {

        NutritionFacts nutritionFacts = new NutritionFactsBuilder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
        CocaCola cocaCola = new CocaCola(nutritionFacts);
        System.out.println("cocaCola:"+cocaCola);
    }
}
