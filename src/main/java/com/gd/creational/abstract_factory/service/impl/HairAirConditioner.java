package com.gd.creational.abstract_factory.service.impl;

import com.gd.creational.abstract_factory.service.AirConditioner;

/**
 * @description TODO
 * author: liquan
 * date: 2020/11/25 17:54
 * version: 1.0
 */
public class HairAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度改变中......");
    }
}
