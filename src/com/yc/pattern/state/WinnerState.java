/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.state;

/**
 * @author Yue Chang
 * @ClassName: WinnerState
 * @Description: TODO
 * @date 2017/6/19 19:22
 */
public class WinnerState implements State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入25美分失败");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退回25美分失败");
    }

    @Override
    public void turnCrank() {
        System.out.println("扭动曲柄，没有变化");
    }

    @Override
    public void dispense() {

        System.out.println("你赢得了另外一颗糖！");
        if (gumballMachine.getCount() == 0 ){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releseBall();
            if (gumballMachine.getCount() > 0 ){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
                System.out.println("没有糖果了...");
            }
        }

    }
}
