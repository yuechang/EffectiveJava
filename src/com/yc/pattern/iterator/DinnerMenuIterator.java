/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: DinnerMenuIterator
 * @Description: TODO
 * @date 2017/6/10 16:26
 */
public class DinnerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public Object next() {

        MenuItem menuItem = null;
        if(position >= 0 && position < menuItems.length){
            menuItem = menuItems[position];
            position +=1;
        }
        return menuItem;
    }

    @Override
    public boolean hasNext() {

        if (position >= menuItems.length || menuItems[position] == null){
            return false;
        }else {
            return true;
        }
    }
}
