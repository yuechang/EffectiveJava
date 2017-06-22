/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.state;

/**
 * @author Yue Chang
 * @ClassName: SoldOutState
 * @Description: 糖果售罄状态
 * @date 2017/6/19 18:15
 */
public class SoldOutState implements State{

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果售罄，不能投入25美分");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果售罄，不能回退25美分");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了曲柄，糖果售罄");
    }

    @Override
    public void dispense() {
        System.out.println("糖果售罄，不能售出糖果");
    }

    @Override
    public void refill(int count) {

        this.gumballMachine.setCount(count);
        this.gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("糖果机填充成功");
    }
}
