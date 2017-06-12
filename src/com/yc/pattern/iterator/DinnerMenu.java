/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: DinnerMenu
 * @Description: 中餐菜单
 * @date 2017/6/10 16:24
 */
public class DinnerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {

        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on  whole wheat",
                true,
                2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99);
        addItem("Soup of the day",
                "Soup of the day,with a side of potato salad",
                false,
                3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut,rlish,onions,topped with cheese",
                false,
                3.05);
    }


    public void addItem(String name, String description, boolean vegetarian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry,menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }
/*
    // 不再使用
    public MenuItem[] getMuneItems(){
        return menuItems;
    }
*/
    public Iterator createIterator() {
        return new DinnerMenuIterator(this);
    }


    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
}
