/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Yue Chang
 * @ClassName: PancakeHouseMenu
 * @Description: TODO
 * @date 2017/6/10 16:03
 */
public class PancakeHouseMenu {

    private List menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs,and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fired eggs,sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Walffles",
                "waffles,with your choice of blueberries or strwaberries",
                true,
                3.59);
    }

    public void addItem(String name,String description,boolean vegetation,double price){

        MenuItem menuItem = new MenuItem(name,description,vegetation,price);
        menuItems.add(menuItem);
    }
/*
    public ArrayList getMenuItems(){
        return menuItems;
    }
*/

    public Iterator createIterrator(){
        return new PancakeHouseIterator(menuItems);
    }
}
