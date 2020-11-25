package com.gd.creational.abstract_factory.factory;

import com.gd.creational.abstract_factory.service.AirConditioner;
import com.gd.creational.abstract_factory.service.Television;
import com.gd.creational.abstract_factory.service.impl.HaierTelevision;
import com.gd.creational.abstract_factory.service.impl.HairAirConditioner;

/**
 * @description TODO
 * author: liquan
 * date: 2020/11/25 17:58
 * version: 1.0
 */
public class HairFactory implements EFactory{
    @Override
    public Television productionTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner productionConditioner() {
        return new HairAirConditioner();
    }
}
