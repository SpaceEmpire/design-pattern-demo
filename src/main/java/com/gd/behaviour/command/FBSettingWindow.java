package com.gd.behaviour.command;

import com.gd.behaviour.command.invoker.FunctionButton;

import java.util.ArrayList;

/**
 * 功能键设置窗口类
 * author: liquan
 * date: 2020/12/14 15:50
 * version: 1.0
 */
public class FBSettingWindow {

    private String title; // 窗口标题

    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunction(FunctionButton fb) {
        functionButtons.add(fb);
    }

    /**
     * 显示窗口及功能键
     */
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        functionButtons.stream().forEach(fb -> {
            System.out.println(fb.getName());
        });
        System.out.println("----------------------");
    }
}
