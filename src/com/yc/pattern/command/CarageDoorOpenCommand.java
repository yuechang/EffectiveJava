/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: CarageDoorOpenCommand
 * @Description: TODO
 * @date 2017/7/9 21:18
 */
public class CarageDoorOpenCommand implements Command {

    private CarageDoor carageDoor;

    public CarageDoorOpenCommand(CarageDoor carageDoor) {
        this.carageDoor = carageDoor;
    }

    @Override
    public void execute() {
        carageDoor.up();
    }
}

