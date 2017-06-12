/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: MenuTestDrive
 * @Description: TODO
 * @date 2017/6/10 17:29
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMune();
/*
        // 测试DinnerMenuIterator remove()方法
        Menu dinnerMenu = new DinnerMenu();
        Iterator iterator = dinnerMenu.createIterator();
        Waitress waitress = new Waitress();
        // 不能迭代，迭代之后，position会自增，可调式看断点
        //waitress.printMenu(iterator);
        //System.out.println();

        iterator.next();
        iterator.remove();
        //waitress.printMenu(iterator);
        System.out.println();
*/

    }
}
