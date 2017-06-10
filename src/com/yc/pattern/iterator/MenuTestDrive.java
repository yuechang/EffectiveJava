/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.iterator;

/**
 * @author Yue Chang
 * @ClassName: MenuTestDrive
 * @Description: TODO
 * @date 2017/6/10 17:29
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMune();;
    }
}
