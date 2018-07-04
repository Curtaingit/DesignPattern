package com.curtain.study._1creational._1singleton.impl4;

/**
 * 双重校验锁
 * 只对实例化那部分代码加锁
 * 对象序列化jvm执行指令：1.分配内存空间  2.初始化对象  3.将singleton4指向分配的内存地址
 * 使用了volatile关键字  禁止指令重排，避免多线程环境下 可能获得未初始化的实例
 *
 * @author Curtain
 * @date 2018/7/3 9:31
 */
public class Singleton {

    private volatile static Singleton singleton;

    private Singleton() {
    }

    private static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
