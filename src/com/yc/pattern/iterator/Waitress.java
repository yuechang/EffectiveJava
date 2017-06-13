/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: Waitress
 * @Description: 服务员类
 * @date 2017/6/10 16:23
 */
public class Waitress {

    private Menu pancakeHouseMenu;
    private Menu dinnerMenu;
    private Menu cafeMenu;

    public Waitress(){}

    public Waitress(Menu pancakeHouseMenu,Menu dinnerMenu,Menu cafeMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {

        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();

        System.out.println("MENU\n------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);
        System.out.println("\nCAFE");
        printMenu(cafeIterator);
    }

    public void printMenu(Iterator iterator) {

        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
