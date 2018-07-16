package com.code.record.design_pattern.builder;

/**
 * @Author: Gao
 * @Time: 2018/7/15 16:02
 * @Description: 功能描述
 *
 * 电脑
 */
public class Computer {
    private String cpu;
    private String memory;
    private String hd;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }
}
