package com.gd.behaviour.command;

import com.gd.behaviour.command.cmd.Command;
import com.gd.behaviour.command.invoker.FunctionButton;

/**
 * 客户端测试代码
 * author: liquan
 * date: 2020/12/14 16:24
 * version: 1.0
 */
public class Client {

    public static void main(String[] args) {

        FBSettingWindow fbsw = new FBSettingWindow("功能按键");

        FunctionButton fb1 = new FunctionButton("功能键1");

        FunctionButton fb2 = new FunctionButton("功能键2");

        Command command1 = (Command)XMLUtil.getBean(0);

        Command command2 = (Command)XMLUtil.getBean(1);

        //将命令对象注入功能键
        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();

        fb1.onClick();
        fb2.onClick();
    }
}
