/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.state;

/**
 * @author Yue Chang
 * @ClassName: GumballMachineTestDrive
 * @Description: TODO
 * @date 2017/6/19 19:56
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
