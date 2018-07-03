package com.curtain.study.singleton;

/**
 * 枚举实现
 * 枚举中的Singleton 就是单例模式
 * 实现单例模式的唯一推荐方法，使用枚举类来实现。
 * 使用枚举类实现单例模式，在对枚举类进行序列化时，还不需要添加readRsolve方法就可以避免单例模式被破坏。
 * @author Curtain
 * @date 2018/7/3 9:42
 */

enum Singleton {
    Singleton;

    public void test() {
        System.out.println(Singleton.hashCode());
    }
}


public class Singleton5 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.Singleton;

        singleton.test();

        singleton = Singleton.Singleton;

        singleton.test();
    }
}



