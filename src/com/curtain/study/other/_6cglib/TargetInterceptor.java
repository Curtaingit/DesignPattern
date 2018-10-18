package com.curtain.study.other._6cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Curtain
 * @date 2018/8/10 15:23
 * 定义一个拦截器。在调用目标方法时，CGLib会回调MethodInterceptor接口方法拦截，
 * 来实现你自己的代理逻辑，类似于JDK中的InvocationHandler接口。
 */
public class TargetInterceptor implements MethodInterceptor{

    /**
     * 重写方法拦截在方法前和方法后加入业务
     * Object obj为目标对象
     * Method method为目标方法
     * Object[] params 为参数，
     * MethodProxy proxy CGlib方法代理对象
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

//        if (method.getName())  具体还可以指定方法来加强

        //这里的sout  就是具体的加强内容  现在逻辑只用输出代替了
        System.out.println(method.getName() + "调用前");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println(method.getName() + "调用后"+result);
        return result;
    }

    @Override
    public String toString() {
        return "1";
    }
}
