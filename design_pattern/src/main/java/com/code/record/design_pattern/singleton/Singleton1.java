package com.code.record.design_pattern.singleton;

/**
 * @Author: Gao
 * @Time: 2018/7/15 2:07
 * @Description: 功能描述
 *
 * 饿汉式 立即加载
 * 优点：反应快，天生线程安全
 * 缺点：资源利用效率差，如果在不使用的情况下也创建了实例，浪费资源
 */

public class Singleton1 {

    //指向自己实例的私有静态引用,主动创建
    private static Singleton1 singleton1 = new Singleton1();

    //私有的构造方法,避免外部创建
    private Singleton1(){}

    //返回自己实例的静态公有方法
    public static Singleton1 getInstance(){
        return singleton1;
    }
}
