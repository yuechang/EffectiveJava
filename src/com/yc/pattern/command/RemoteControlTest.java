/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: RemoteControlTest
 * @Description: 命令模式的客户
 * @date 2017/7/9 21:10
 */
public class RemoteControlTest {

    public static void main(String[] args) {

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorUpCommand carageDoorUpCommand = new GarageDoorUpCommand(garageDoor);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(carageDoorUpCommand);
        simpleRemoteControl.buttonWasPressed();
    }

}

