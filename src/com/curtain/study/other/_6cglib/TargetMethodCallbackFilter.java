package com.curtain.study.other._6cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * @author Curtain
 * @date 2018/8/10 16:04
 * 回调方法过滤
 */
public class TargetMethodCallbackFilter implements CallbackFilter {

    /**
     * 过滤方法
     * 返回的值为数字，代表了Callback数组中的索引位置，要到用的Callback
     * 回调数组Callback[]中的位置索引  如0表示 test2（）callbacks中的callback(TargetInterceptor)对象
     */
    @Override
    public int accept(Method method) {
        if (method.getName().equals("method1")) {
            System.out.println("filter method1 ==0");
            return 0;
        }
        if (method.getName().equals("method2")) {
            System.out.println("filter method2 ==1");
            return 1;
        }
        if (method.getName().equals("method3")) {
            System.out.println("filter method3 ==2");
            return 2;
        }
        return 0;

    }
}
