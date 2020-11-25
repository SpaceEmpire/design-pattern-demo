package com.gd.creational.abstract_factory.test;

import com.gd.creational.abstract_factory.XMLUtil;
import com.gd.creational.abstract_factory.factory.EFactory;
import com.gd.creational.abstract_factory.service.AirConditioner;
import com.gd.creational.abstract_factory.service.Television;

/**
 * @description TODO
 * author: liquan
 * date: 2020/11/25 18:02
 * version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        EFactory factory;

        Television television;

        AirConditioner airConditioner;

        factory = (EFactory) XMLUtil.getBean();

        airConditioner = factory.productionConditioner();

        television = factory.productionTelevision();

        television.play();

        airConditioner.changeTemperature();
    }
}
