/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.observer;

/**
 * @author Yue Chang
 * @ClassName: Subject
 * @Description: 主题接口
 * @date 2017/8/1 11:29
 */
public interface Subject {
    /**
     * 注册订阅
     * @param observer 观察者对象
     */
    void registerObserver(Observer observer);

    /**
     * 删除订阅
     * @param observer 观察者对象
     */
    void removeObserver(Observer observer);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有的观察者。
     */
    void notifyObservers();
}
