/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.component;

/**
 * @author Yue Chang
 * @ClassName: MenuTestDrive
 * @Description: TODO
 * @date 2017/6/14 17:56
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        dinnerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));
        dinnerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on  whole wheat",
                true,
                2.99));
        dinnerMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));
        dinnerMenu.add(new MenuItem(
                "Hotdog",
                "A hot dog, with saurkraut,rlish,onions,topped with cheese",
                false,
                3.05));

        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59));

        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs,and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fired eggs,sausage",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem(
                "Walffles",
                "waffles,with your choice of blueberries or strwaberries",
                true,
                3.59));

        cafeMenu.add(new MenuItem(
                "Veggie Burger and Airs Fries",
                "Veggie burger on a whole wheat bun,lettuce,tomato,and fries",
                true,
                3.99));
        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "Soup of the day,with a side of potato salad",
                true,
                3.69));
        cafeMenu.add(new MenuItem(
                "Burrito",
                "A large burrito,with whole pinto beans,salsa,guacamole",
                true,
                4.29));

        Waitress waitress = new Waitress(allMenus);
        //waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
