package com.curtain.study.singleton;

/**
 * 懒汉式线程安全
 * 对getInstance方法加锁，保证了线程安全
 * 但是当一个线程进入该方法后都必须等待，性能上有了一定的损耗
 *
 * @author Curtain
 * @date 2018/7/3 9:23
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }

        return singleton2;
    }
}
