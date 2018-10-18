package com.curtain.study.other._6cglib;

import net.sf.cglib.proxy.FixedValue;

/**
 * @author Curtain
 * @date 2018/8/10 16:16
 * 表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定值
 */
public class TargetResultFixed implements FixedValue {
    @Override
    public Object loadObject() throws Exception {
        System.out.println("锁定结果");
        Object obj = 999;
        return obj;
    }
}
