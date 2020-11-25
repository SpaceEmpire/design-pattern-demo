package com.gd.creational.abstract_factory.factory;

import com.gd.creational.abstract_factory.service.AirConditioner;
import com.gd.creational.abstract_factory.service.Television;

/**
 * @description TODO
 * author: liquan
 * date: 2020/11/25 17:56
 * version: 1.0
 */
public interface EFactory {

    Television productionTelevision();

    AirConditioner productionConditioner();
}
