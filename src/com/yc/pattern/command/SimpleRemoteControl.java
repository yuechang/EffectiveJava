/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: SimpleRemoteControl
 * @Description: TODO
 * @date 2017/7/9 21:00
 */
public class SimpleRemoteControl {

    // 有一个插槽持有命令，而这个命令控制这一个装置
    private Command slot;

    // 这个方法用来设置插槽控制的命令。如果这段代码的客户想要改变遥控器的行为，可以多次调用这个方法。
    public SimpleRemoteControl() {
    }

    // 当按下这个按钮时，这个方法就会被调用，使得当前命令衔接插槽，并调用它的execute()方法。
    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}

