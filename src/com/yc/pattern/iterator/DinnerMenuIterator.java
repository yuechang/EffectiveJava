/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: DinnerMenuIterator
 * @Description: 中餐菜单迭代器
 * @date 2017/6/10 16:26
 */
public class DinnerMenuIterator implements Iterator {

    DinnerMenu dinnerMenu;
    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(DinnerMenu dinnerMenu) {
        this.menuItems = dinnerMenu.getMenuItems();
        this.dinnerMenu = dinnerMenu;
    }

    @Override
    public Object next() {

        MenuItem menuItem = null;
        if (position >= 0 && position < menuItems.length) {
            menuItem = menuItems[position];
            position += 1;
        }
        return menuItem;
    }

    public void remove() {

        if (position <= 0) {
            throw new IllegalStateException("你不能执行移除操作，至少得执行一次next()操作");
        } else {
            if (menuItems[position] != null) {
                for (int i = position - 1; i < menuItems.length - 2; i++) {
                    menuItems[i] = menuItems[i + 1];
                }
                menuItems[menuItems.length - 1] = null;
            }
            // postion减一
            position -= 1;
            // 设置NumberOfItems减一
            dinnerMenu.setNumberOfItems(dinnerMenu.getNumberOfItems() - 1);
        }
    }

    @Override
    public boolean hasNext() {

        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
