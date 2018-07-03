package com.curtain.study.singleton;

/**
 * 双重校验锁
 * 只对实例化那部分代码加锁
 * 对象序列化jvm执行指令：1.分配内存空间  2.初始化对象  3.将singleton4指向分配的内存地址
 * 使用了volatile关键字  禁止指令重排，避免多线程环境下 可能获得未初始化的实例
 *
 * @author Curtain
 * @date 2018/7/3 9:31
 */
public class Singleton4 {

    private volatile static Singleton4 singleton4;

    private Singleton4() {
    }

    private static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
