/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.component;

import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: MenuComponent
 * @Description: 菜单组件
 * @date 2017/6/14 17:20
 */
public abstract class MenuComponent {

    // "组合"方法：新增、删除和取得菜单组件
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    // "操作"方法，它们被某单项使用，其中一些也可用在菜单上
    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    // 这个方法同时被菜单和菜单项所实现
    public void print(){
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
