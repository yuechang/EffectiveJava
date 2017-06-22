/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.state;

/**
 * @author Yue Chang
 * @ClassName: SoldState
 * @Description: 售出糖果状态
 * @date 2017/6/19 18:00
 */
public class SoldState implements State {

    private  GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你不能放入25美分");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在出售糖果，无法退回25美分");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了曲柄，正在出货");
    }

    @Override
    public void dispense() {

        gumballMachine.releseBall();
        int count = gumballMachine.getCount();
        if(count > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            System.out.println("糖果发放成功！");
            System.out.println();
        } else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
            System.out.println("没有糖果了...");
        }
    }

    @Override
    public void refill(int count) {
        System.out.println("糖果未售罄，不需填充");
    }
}
