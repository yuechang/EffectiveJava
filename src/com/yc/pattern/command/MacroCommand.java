/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: MacroCommand
 * @Description: TODO
 * @date 2017/7/13 17:12
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0 ; i < commands.length ; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0 ; i < commands.length ; i++){
            commands[i].undo();
        }
    }
}
