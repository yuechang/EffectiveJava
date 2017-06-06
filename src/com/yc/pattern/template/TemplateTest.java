/*
 * Copyright (c) 2016, 2025, HHLY and/or its affiliates. All rights reserved.
 * HHLY PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.yc.pattern.template;

/**
 * @ClassName: TemplateTest
 * @Description: 模板测试类
 * @author Yue Chang
 * @date 2017年6月6日 上午12:21:20
 * @since 1.0
 */
public class TemplateTest {

    public static void main(String[] args) {

        CoffeineBeverage coffee = new Coffee();
        coffee.getCoffeineBeverage();

        System.out.println();

        CoffeineBeverage tea = new Tea();
        tea.getCoffeineBeverage();
    }
}
