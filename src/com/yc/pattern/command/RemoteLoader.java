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

        // remoteLoaderTest();

        // remoteLoaderWithUndoTest();

        // remoteLoaderCeilingFanTest();

        macroCommandTest();
    }

    /**
     * 宏命令测试
     */
    private static void macroCommandTest() {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        // 创建所有的装置
        Light light = new Light("卧室");
        Stereo stereo = new Stereo("卧室");

        // 所有On命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);

        // 所有Off命令
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // 开启和关闭数据记录对应的命令
        Command[] partyOn = {lightOnCommand,stereoOnCommand};
        Command[] partyOff = {lightOffCommand,stereoOffCommand};

        MacroCommand partyOnMarco = new MacroCommand(partyOn);
        MacroCommand partyOffMarco = new MacroCommand(partyOff);

        remoteControl.setCommand(0,partyOnMarco,partyOffMarco);

        System.out.println(remoteControl);
        System.out.println("------- 按下打开聚会键 -----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("------- 按下关闭聚会键 -----");
        remoteControl.offButtonWasPushed(0);

    }

    /**
     * 测试吊扇功能
     */
    private static void remoteLoaderCeilingFanTest() {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("卧室");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingOffCommand ceilingFanOffCommand = new CeilingOffCommand(ceilingFan);

        remoteControl.setCommand(0,ceilingFanLowCommand,ceilingFanOffCommand);
        remoteControl.setCommand(1,ceilingFanMediumCommand,ceilingFanOffCommand);
        remoteControl.setCommand(2,ceilingFanHighCommand,ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed(2);

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

