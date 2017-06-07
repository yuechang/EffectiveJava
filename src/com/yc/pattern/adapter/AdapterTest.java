/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.adapter;

/**
 * @author Yue Chang
 * @ClassName: AdapterTest
 * @Description: 适配器模式测试类
 * @date 2017/6/7 22:02
 */
public class AdapterTest {

    public static void main(String[] args) {

        // 初始化火鸡对象
        Turkey wildTurkey = new WildTurkey();
        // 将火鸡对象转换成鸭子对象
        TurkeyAdapter duck = new TurkeyAdapter(wildTurkey);
        // 转换后对象具有鸭子对象的行为：飞行以及叫
        duck.fly();
        duck.quack();

        System.out.println();

        // 初始化鸭对象
        Duck redHeadDuck = new RedHeadDuck();
        // 将鸭子对象转换成火鸡对象
        DuckAdapter turkey = new DuckAdapter(redHeadDuck);
        // 转换后对象具有鸭子对象的行为：飞行以及叫
        turkey.fly();
        turkey.gobble();

    }
}
