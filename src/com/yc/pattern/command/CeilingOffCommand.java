/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: CeilingOffCommand
 * @Description: TODO
 * @date 2017/7/11 23:50
 */
public class CeilingOffCommand implements Command {

    private CeilingFan ceilingFan;
    // 增加成员变量状态以便追踪吊扇之前的状态
    private int prevSpeed;

    public CeilingOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    /**
     * 在改变吊扇的速度之前，需要将它之前的状态记录起来，以便需要撤销时使用
     */
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
        System.out.println(ceilingFan.getLocation()+"吊扇，已关闭");
    }

    /**
     * 将吊扇的速度设置回之前的值，达到撤销的目的
     */
    @Override
    public void undo() {

        if (prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}

