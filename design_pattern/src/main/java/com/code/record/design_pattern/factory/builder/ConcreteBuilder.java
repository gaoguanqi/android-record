package com.code.record.design_pattern.factory.builder;

/**
 * @Author: Gao
 * @Time: 2018/7/15 16:05
 * @Description: 功能描述
 *
 * 装机人员
 */
public class ConcreteBuilder extends Builder{

    //创建产品实例
    private Computer mComputer = new Computer();

    @Override
    public void setCPU(String cpu) {
        mComputer.setCpu(cpu);
    }

    @Override
    public void setMemory(String memory) {
        mComputer.setMemory(memory);
    }

    @Override
    public void setHD(String hd) {
        mComputer.setHd(hd);
    }

    @Override
    public Computer build() {
        return mComputer;
    }
}
