/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.adapter;

/**
 * @author Yue Chang
 * @ClassName: WildTurkey
 * @Description: 火鸡实现类
 * @date 2017/6/7 17:19
 */
public class WildTurkey implements Turkey {

    @Override
    public void fly() {
        System.out.println("fly a short distance");
    }

    @Override
    public void gobble() {
        System.out.println("gobble");
    }
}
