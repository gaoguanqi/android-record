package com.code.record.design_pattern.factory.simple_factory;

/**
 * @Author: Gao
 * @Time: 2018/7/15 11:55
 * @Description: 功能描述
 *
 * 具体的汽车奔驰
 */
public class Benz extends Car{

    @Override
    public void drive() {
        System.out.println(this.getName()+"--drive--");
    }
}
