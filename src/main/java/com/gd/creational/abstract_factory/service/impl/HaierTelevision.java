package com.gd.creational.abstract_factory.service.impl;

import com.gd.creational.abstract_factory.service.Television;

/**
 * @description TODO
 * author: liquan
 * date: 2020/11/25 17:47
 * version: 1.0
 */
public class HaierTelevision implements Television {
    @Override
    public void play() {
        System.out.println("海尔电视播放中......");
    }
}
