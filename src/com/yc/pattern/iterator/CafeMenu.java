/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: CafeMenu
 * @Description: 咖啡厅菜单
 * @date 2017/6/13 21:42
 */
public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {

        addItem("Veggie Burger and Airs Fries",
                "Veggie burger on a whole wheat bun,lettuce,tomato,and fries",
                true,
                3.99);
        addItem("Soup of the day",
                "Soup of the day,with a side of potato salad",
                true,
                3.69);
        addItem("Burrito",
                "A large burrito,with whole pinto beans,salsa,guacamole",
                true,
                4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name,menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}

