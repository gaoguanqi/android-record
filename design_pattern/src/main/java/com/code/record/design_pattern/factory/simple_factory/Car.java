package com.code.record.design_pattern.factory.simple_factory;

/**
 * @Author: Gao
 * @Time: 2018/7/15 11:54
 * @Description: 功能描述
 * 抽象汽车类
 */
public abstract class Car {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 子类具体实现业务
     */
    public abstract void drive();
}
