/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.component;

import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: Waitress
 * @Description: TODO
 * @date 2017/6/14 17:55
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){

        Iterator iterator = allMenus.createIterator();
        System.out.println("\n VEGETARIAN MENU\n-------");
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e){}
        }
    }
}
