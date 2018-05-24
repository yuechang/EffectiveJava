/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.decorator.coffee;

/**
 * @author Yue Chang
 * @ClassName: CondimentDecorator
 * @Description: 调料抽象类
 * @date 2017/7/17 12:17
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
