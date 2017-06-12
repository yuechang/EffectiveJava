/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Yue Chang
 * @ClassName: PancakeHouseIterator
 * @Description: 煎饼屋迭代器类(Pancake直接使用List.iterator()方法之后，不再使用)
 * @date 2017/6/10 15:39
 */
public class PancakeHouseIterator implements Iterator {

    private List menuItems;
    int position = 0;

    public PancakeHouseIterator(List menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public Object next(){
        Object menuItem = null;
        if (position >= 0 && position < menuItems.size()){
            menuItem = menuItems.get(position);
            position += 1;
        }
        return menuItem;
    }

    @Override
    public boolean hasNext(){
        if (position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        }else {
            return true;
        }
    }
}
