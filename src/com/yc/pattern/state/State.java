/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.state;

/**
 * @author Yue Chang
 * @ClassName: State
 * @Description: 糖果机状态对象
 * @date 2017/6/19 11:31
 */
public interface State {
    // 放入25美分硬币
    void insertQuarter();
    // 退回25美分硬币
    void ejectQuarter();
    // 扭动曲柄
    void turnCrank();
    // 发放糖果
    void dispense();
    // 填充糖果
    void refill(int count);
}
