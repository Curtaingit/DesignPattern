package com.curtain.study._1creational._1singleton.impl2;

/**
 * 懒汉式线程安全
 * 对getInstance方法加锁，保证了线程安全
 * 但是当一个线程进入该方法后都必须等待，性能上有了一定的损耗
 *
 * @author Curtain
 * @date 2018/7/3 9:23
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
