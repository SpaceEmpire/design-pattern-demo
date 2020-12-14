package com.gd.behaviour.command.invoker;

import com.gd.behaviour.command.cmd.Command;

/**
 * 功能键类：请求发送者
 * author: liquan
 * date: 2020/12/14 15:51
 * version: 1.0
 */
public class FunctionButton {

    private String name; // 功能键名称

    private Command command; // 维持一个抽象命令对象的引用

    public FunctionButton(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getName() {
        return this.name;
    }

    public void onClick() {
        System.out.println("点击功能按钮：" + this.name);
        this.command.execute();
    }

}
