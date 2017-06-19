/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.state;

/**
 * @author Yue Chang
 * @ClassName: NoQuarterState
 * @Description: 没有25美分状态类
 * @date 2017/6/19 11:34
 */
public class NoQuarterState implements State{

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投入了25美分");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你还没有投入25美分");
    }

    @Override
    public void turnCrank() {
        System.out.println("你扭动了曲柄，但是你没有放入25美分");
    }

    @Override
    public void dispense() {
        System.out.println("你需要先付款");
    }
}