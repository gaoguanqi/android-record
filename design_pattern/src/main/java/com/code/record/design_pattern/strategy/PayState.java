package com.code.record.design_pattern.strategy;

/**
 * @Author: Gao
 * @Time: 2018/7/16 18:58
 * @Description: 功能描述
 */
public class PayState {
    private int state;
    private String name;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
