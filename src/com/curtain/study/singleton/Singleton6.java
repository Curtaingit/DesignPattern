package com.curtain.study.singleton;

import java.io.Serializable;
import java.util.function.Predicate;

/**
 * 序列化和反射会使单例失效
 * 解决序列化：添加readResolve方法
 * 解决反射：设置标记, 通过反射创建第二个对象时抛出异常
 * 用的是饿汉式单例做演示
 *
 * @author Curtain
 * @date 2018/7/3 9:52
 */
public class Singleton6 implements Serializable {

    //避免序列化
//    private static final long serialVersionUID = 1L;
//
//    private static Singleton6 singleton6 = new Singleton6();
//
//    private Singleton6() {
//    }
//
//    public static Singleton6 getInstance() {
//        return singleton6;
//    }
//
//    private Object readResolve(){
//        return singleton6;
//    }

    //避免反射破坏
    private static boolean flag = false;
    private static final long serialVersionUID = 1L;

    private static Singleton6 singleton6 = new Singleton6();

    private Singleton6() {
        synchronized (Singleton6.class) {
            if (flag == false) {
                //第一次初始化
                flag = !flag;
            } else {
                throw new RuntimeException("不允许通过反射 重复创建实例");
            }
        }
    }

    public static Singleton6 getInstance() {
        return singleton6;
    }

    private Object readResolve() {
        return singleton6;
    }
}
