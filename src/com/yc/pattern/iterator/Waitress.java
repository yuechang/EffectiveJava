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

    public Waitress(){}

    public Waitress(Menu pancakeHouseMenu,Menu dinnerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMune() {

        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();

        System.out.println("MENU\n------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);
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
