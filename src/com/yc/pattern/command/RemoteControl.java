/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

import java.util.Arrays;

/**
 * @author Yue Chang
 * @ClassName: RemoteControl
 * @Description: 遥控器
 * @date 2017/7/9 22:34
 */
public class RemoteControl {

    // 遥控器要处理7个开与关的命令，使用相应数组记录这些命令
    private  Command[] onCommands;
    private  Command[] offCommands;

    // 构造器中，只需实例化并初始化这两个开与关的数组
    public RemoteControl() {

        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0 ; i < 7 ; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     *
     * @param slot 插槽的位置
     * @param onCommand 开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // 当按下开或者关的按钮，硬件就会负责调用对应的方法
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- Remote Control ----- \n ");
        for (int i = 0 ; i < onCommands.length ; i++){
            stringBuffer.append("slot" + i + "]" + onCommands[i].getClass().getName());
            stringBuffer.append("     " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}

