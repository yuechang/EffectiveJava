/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.observer;

/**
 * @author Yue Chang
 * @ClassName: DisplayElement
 * @Description: 展示对象
 * @date 2017/8/1 11:36
 */
public interface DisplayElement {

    /**
     * 当布告板需要显示时，调用此方法
     */
    void display();
}
