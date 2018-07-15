package com.code.record.design_pattern.singleton;

/**
 * @Author: Gao
 * @Time: 2018/7/15 2:07
 * @Description: 功能描述
 *
 * 懒汉式 懒加载
 * 优点：只有在真正使用的情况下才创建实例，避免内存资源浪费
 * 缺点：效率较高，天生线程不安全
 */

public class Singleton2 {


    //指向自己实例的私有静态引用，不主动创建
    private  volatile static  Singleton2 singleton2;

    //私有构造方法，避免外部创建
    private Singleton2(){}

    //返回自己实例的静态公有方法，被动创建，在真正需要使用时才创建
    //天生线程不安全
    public static Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
