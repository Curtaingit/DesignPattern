package com.curtain.study._1creational._1singleton.impl6;

import java.io.Serializable;

/**
 * 序列化和反射会使单例失效
 * 解决序列化：添加readResolve方法
 * 解决反射：设置标记, 通过反射创建第二个对象时抛出异常
 * 用的是饿汉式单例做演示
 *
 * @author Curtain
 * @date 2018/7/3 9:52
 */
public class Singleton implements Serializable {

    //避免序列化
//    private static final long serialVersionUID = 1L;
//
//    private static Singleton singleton = new Singleton();
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return singleton;
//    }
//
//    private Object readResolve(){
//        return singleton;
//    }

    //避免反射破坏
    private static boolean flag = false;
    private static final long serialVersionUID = 1L;

    private static Singleton singleton = new Singleton();

    private Singleton() {
        synchronized (Singleton.class) {
            if (flag == false) {
                //第一次初始化
                flag = !flag;
            } else {
                throw new RuntimeException("不允许通过反射 重复创建实例");
            }
        }
    }

    public static Singleton getInstance() {
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }
}
