/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.adapter;


/**
 * @author Yue Chang
 * @ClassName: DuckAdapter
 * @Description: 火鸡适配器(将火鸡适配成鸭)
 * @date 2017/6/7 17:08
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i = 0 ; i < 5 ; i++){
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
