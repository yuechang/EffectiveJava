/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: RemoteLoader
 * @Description: 测试遥控器
 * @date 2017/7/10 21:52
 */
public class RemoteLoader {

    public static void main(String[] args) {

        //remoteLoaderTest();

        remoteLoaderWithUndoTest();
    }

    /**
     * 含有撤销功能的测试代码
     */
    private static void remoteLoaderWithUndoTest() {

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        // 将所有的装置创建在适当的位置
        Light livingRoomLight = new Light("卧室");
        // 创建卧室和厨房灯的命令
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        remoteControlWithUndo.setCommand(0,livingRoomLightOnCommand,livingRoomLightOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);

        remoteControlWithUndo.undoButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);

        remoteControlWithUndo.undoButtonWasPushed(0);
    }

    /**
     * 测试代码
     */
    private static void remoteLoaderTest() {
        RemoteControl remoteControl = new RemoteControl();

        // 将所有的装置创建在适当的位置
        Light livingRoomLight = new Light("卧室");
        Light kitchenLight = new Light("厨房");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("卧室");

        // 创建卧室和厨房灯的命令
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        // 创建车库门上下命令
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        // 创建音响开关命令
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // 加载到遥控器插槽中
        remoteControl.setCommand(0,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteControl.setCommand(1,kitchenLightOnCommand,kitchenLightOffCommand);
        remoteControl.setCommand(2,garageDoorUpCommand,garageDoorDownCommand);
        remoteControl.setCommand(3,stereoOnCommand,stereoOffCommand);

        System.out.println(remoteControl);

        // 逐步按下开与关的命令
        for (int i = 0 ; i < 3 ; i++){
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
            System.out.println();
        }
    }
}

