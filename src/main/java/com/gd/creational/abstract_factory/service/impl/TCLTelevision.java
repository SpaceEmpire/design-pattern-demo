package com.gd.creational.abstract_factory.service.impl;

import com.gd.creational.abstract_factory.service.Television;

/**
 * @description TODO
 * author: liquan
 * date: 2020/11/25 17:46
 * version: 1.0
 */
public class TCLTelevision implements Television {
    @Override
    public void play() {
        System.out.println("TCL电视播放中......");
    }
}
