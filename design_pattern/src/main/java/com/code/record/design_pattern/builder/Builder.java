package com.code.record.design_pattern.builder;

/**
 * @Author: Gao
 * @Time: 2018/7/15 16:05
 * @Description: 功能描述
 *
 * 组装电脑的过程
 */
public abstract class Builder {
    public abstract void setCPU(String cpu);//组装CPU

    public abstract void setMemory(String memory);//组装内存

    public abstract void setHD(String hd);//组装硬盘

    public abstract Computer build();//返回组装好的电脑

}
