/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Chang
 * @ClassName: Pizza
 * @Description: 披萨
 * @date 2017/7/14 22:28
 */
public abstract class Pizza {

    // 名称
    protected String name;
    // 面团
    protected String dough;
    // 酱
    protected String sauce;
    // 配料
    protected List toppings = new ArrayList<String>();

    /**
     * 准备工作
     */
    public void prepare(){
        System.out.println("准备 " + name);
        System.out.println("擀揉面皮...");
        System.out.println("添加佐料...");
        System.out.println("添加配料：");
        for (int i = 0 ; i < toppings.size() ; i++){
            System.out.println("  " + toppings.get(i));
        }
    }

    /**
     * 烘烤
     */
    public void bake(){
        System.out.println("在350华氏度中烘烤25分钟");
    }

    /**
     * 切片
     */
    public void cut(){
        System.out.println("把披萨对角切片");
    }

    /**
     * 装盒
     */
    public void box(){
        System.out.println("把披萨放入官方PizzaStore盒子中");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List getToppings() {
        return toppings;
    }

    public void setToppings(List toppings) {
        this.toppings = toppings;
    }
}

