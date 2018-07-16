package com.code.record.design_pattern.builder;

/**
 * @Author: Gao
 * @Time: 2018/7/15 16:08
 * @Description: 功能描述
 *
 * 定义指挥者类
 * 老板委派任务给装机人员
 */
public class Director {
    private Builder mBuild;

    public Director(Builder mBuild) {
        this.mBuild = mBuild;
    }

    //指挥装机人员组装电脑
    //指挥装机人员组装电脑
    public void Construct(String cpu, String memory, String hd) {
        mBuild.setCPU(cpu);
        mBuild.setMemory(memory);
        mBuild.setHD(hd);
    }
}
