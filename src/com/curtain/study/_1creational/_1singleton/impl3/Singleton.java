package com.curtain.study._1creational._1singleton.impl3;

/**
 * 饿汉式线程安全
 * 避免了多次创建实例的线程安全问题
 * 但是丢失了延迟实例化带来的节约资源优势
 *
 * @author Curtain
 * @date 2018/7/3 9:24
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }


}
