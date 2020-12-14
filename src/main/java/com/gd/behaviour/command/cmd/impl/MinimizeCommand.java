package com.gd.behaviour.command.cmd.impl;

import com.gd.behaviour.command.cmd.Command;
import com.gd.behaviour.command.receiver.WindowHanlder;

/**
 * 最小化命令类：具体命令类
 * author: liquan
 * date: 2020/12/14 15:51
 * version: 1.0
 */
public class MinimizeCommand extends Command {

    private WindowHanlder windowHanlder;

    public MinimizeCommand() {
        this.windowHanlder = new WindowHanlder();
    }

    @Override
    public void execute() {
        windowHanlder.minimize();
    }
}
