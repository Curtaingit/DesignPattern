package com.curtain.study._1creational._1singleton.impl1;

/**
 * 懒汉式线程不安全
 * 一个私有构造函数，一个私有静态变量，一个公有静态函数实现
 * 实例延迟加载，没用用到，就不会实例化
 * 但这个实现是线程不安全的
 *
 * @author Curtain
 * @date 2018/7/3 9:21
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
