package com.code.record.design_pattern.singleton;

/**
 * @Author: Gao
 * @Time: 2018/7/15 2:07
 * @Description: 功能描述
 *
 * 懒汉式 延迟加载
 * 优点：只有在真正使用的情况下才创建实例，避免资源浪费
 * 缺点：反应不及饿汉式，天生线程不安全
 */

public class Singleton2 {

    /**
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
     */

    //为了解决线程安全问题，需要加锁，间接影响了效率
    /**
     *  一，使用 volatile 修饰
     *     volatile的作用:
     *     1.保证可见性
     *      可以保证在多线程环境下，变量的修改可见性。
     *      每个线程都会在工作内存（类似于寄存器和高速缓存），
     *      实例对象都存放在主内存中，在每个线程要使用的时候把主内存中的内容拷贝到线程的工作内存中。
     *      使用volatile关键字修饰后的变量，保证每次修改了变量需要立即写回主内存中，
     *      同时通知所有的该对变量的缓存失效，保证缓存一致性，
     *      其他线程需要使用该共享变量时就要重新从住内存中获取最新的内容拷贝到工作内存中供处理器使用。
     *      这样就可以保证变量修改的可见性了。
     *      但volatile不能保证原子性，比如++操作。
     *
     *    2.提供内存屏障
     *      volatile关键字能够通过提供内存屏障，
     *      来保证某些指令顺序处理器不能够优化重排，
     *      编译器在生成字节码时，会
     *      在指令序列中插入内存屏障来禁止特定类型的处理器重排序。
     *
     *  二，加同步锁 synchronized
     */

    private static volatile Singleton2 singleton2;

    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized (Singleton2.class){
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
