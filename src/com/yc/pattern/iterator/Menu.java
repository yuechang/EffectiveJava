/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: Menu
 * @Description: 菜单接口
 * @date 2017/6/12 20:30
 */
public interface Menu {
    Iterator createIterator();
}
