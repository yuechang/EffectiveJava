/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.state;

import java.util.Random;

/**
 * @author Yue Chang
 * @ClassName: HasQuarterState
 * @Description: 有25美分状态
 * @date 2017/6/19 17:24
 */
public class HasQuarterState implements State {

    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经放过25美分");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退回25美分");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("扭动曲柄...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("没有其他糖果机可操作");
    }

    @Override
    public void refill(int count) {
        System.out.println("糖果未售罄，不需填充");
    }
}
