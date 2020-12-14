package com.gd.behaviour.command.cmd.impl;

import com.gd.behaviour.command.cmd.Command;
import com.gd.behaviour.command.receiver.HelpHandler;

/**
 * 帮助命令类：具体命令类
 * author: liquan
 * date: 2020/12/14 15:51
 * version: 1.0
 */
public class HelpCommand extends Command {

    private HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }


    @Override
    public void execute() {
        helpHandler.display();
    }
}
