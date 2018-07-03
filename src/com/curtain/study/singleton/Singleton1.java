package com.curtain.study.singleton;

/**
 * 懒汉式线程不安全
 * 一个私有构造函数，一个私有静态变量，一个公有静态函数实现
 * 实例延迟加载，没用用到，就不会实例化
 * 但这个实现是线程不安全的
 *
 * @author Curtain
 * @date 2018/7/3 9:21
 */
public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}
