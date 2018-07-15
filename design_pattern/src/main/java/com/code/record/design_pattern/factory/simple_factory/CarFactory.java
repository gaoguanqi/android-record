package com.code.record.design_pattern.factory.simple_factory;

/**
 * @Author: Gao
 * @Time: 2018/7/15 12:00
 * @Description: 功能描述
 *
 * 简单工厂，根据名字，生产不同品牌的汽车工厂
 */
public class CarFactory {
    public static Car createCar(String carName){
        Car car = null;
        if("Benz".equalsIgnoreCase(carName)){
            car = new Benz();
        }else if("Bmw".equalsIgnoreCase(carName)){
            car = new Bmw();
        }
        return car;
    }
}
