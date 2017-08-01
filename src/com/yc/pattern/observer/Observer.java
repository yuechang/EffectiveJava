/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.observer;

/**
 * @author Yue Chang
 * @ClassName: Observer
 * @Description: 观察者接口
 * @date 2017/8/1 11:29
 */
public interface Observer {
    /**
     * 当气象观察值改变时，主题会把这些状态值当做方法的参数，
     * 传递给观察者。
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    public void update(float temp,float humidity,float pressure);
}
