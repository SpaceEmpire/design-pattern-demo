package com.gd.creational.abstract_factory.factory;

import com.gd.creational.abstract_factory.service.AirConditioner;
import com.gd.creational.abstract_factory.service.Television;
import com.gd.creational.abstract_factory.service.impl.TCLAirConditioner;
import com.gd.creational.abstract_factory.service.impl.TCLTelevision;

/**
 * @description TODO
 * author: liquan
 * date: 2020/11/25 17:59
 * version: 1.0
 */
public class TCLFactory implements EFactory {
    @Override
    public Television productionTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner productionConditioner() {
        return new TCLAirConditioner();
    }
}
