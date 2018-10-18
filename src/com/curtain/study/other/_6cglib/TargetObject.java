package com.curtain.study.other._6cglib;

/**
 * @author Curtain
 * @date 2018/8/10 15:20
 * 被代理类
 * 首先，定义一个类，该类没有实现任何接口
 */
public class TargetObject {

    public String method1(String paramName){
        return paramName;
    }

    public int method2(int count){
        return count;
    }

    public int method3(int count){
        return count;
    }

    @Override
    public String toString() {
        return "TargetObject []" + getClass();
    }
}
