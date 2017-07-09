/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: LightOnCommand
 * @Description: 打开电灯的命令
 * @date 2017/7/9 20:55
 */
public class LightOnCommand implements Command {

    private Light light;

    /**
     * 构造器被传入了某个电灯，以便让这个命令控制，然后记录在实例变量中。
     * 一旦调用execute()，就由这个电灯对象成为接收者，负责接收请求。
     * @param light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 这个execute()方法调用接收对象(我们正在控制的电灯)的on()方法
     */
    @Override
    public void execute() {
        light.on();
    }
}

