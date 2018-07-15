package com.code.record.design_pattern.factory.builder;

/**
 * @Author: Gao
 * @Time: 2018/7/15 16:09
 * @Description: 功能描述
 */
public class Test {

    public static void  main(String args[]){

        ConcreteBuilder builder = new ConcreteBuilder();
        builder.setCPU("i7");
        builder.setMemory("8GB");
        builder.setHD("1T");
        builder.build();
        Director director = new Director(builder);
    }
}
