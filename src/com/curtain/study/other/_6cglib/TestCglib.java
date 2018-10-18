package com.curtain.study.other._6cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * @author Curtain
 * @date 2018/8/10 15:34
 * by:https://blog.csdn.net/zghwaicsdn/article/details/50957474
 * Enhancer类是CGLib中的一个字节码增强器,它可以方便的对你想要处理的类进行扩展
 * 首先将被代理类TargetObject设置成父类，然后设置拦截器TargetInterceptor
 * 最后执行enhancer.create()动态生成一个代理类，并从Object强制转型成父类型TargetObject。
 */
public class TestCglib {

    public static void main(String[] args) {

        test1();

//        test2();;

//        test3();
    }

    /**
     * 简单代理 测试
     */
    private static void test1(){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TargetObject.class);
        enhancer.setCallback(new TargetInterceptor());

        TargetObject targetObject2= (TargetObject) enhancer.create();

        System.out.println(targetObject2);

        System.out.println(targetObject2.method1("mm1"));
        System.out.println(targetObject2.method2(100));
        System.out.println(targetObject2.method3(200));
    }

    /**
     * 增加过滤器 代理测试
     */
    private static void test2(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
        CallbackFilter callbackFilter = new TargetMethodCallbackFilter();

        /*
         (1)callback1：方法拦截器
         (2)NoOp.INSTANCE：这个NoOp表示no operator，即什么操作也不做，代理类直接调用被代理的方法不进行拦截。
         (3)FixedValue：表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定值。
         */
        Callback noopCb = NoOp.INSTANCE;
        Callback callback = new TargetInterceptor();
        Callback fixedValue = new TargetResultFixed();
        //索引顺序对应 过滤器（TargetMethodCallbackFilter）类中返回值的位置
        Callback[] callbacks = new Callback[]{callback,noopCb,fixedValue};

        enhancer.setCallbacks(callbacks);
        enhancer.setCallbackFilter(callbackFilter);
        TargetObject targetObject = (TargetObject) enhancer.create();
        System.out.println(targetObject);
        System.out.println(targetObject.method1("mmm1"));
        System.out.println(targetObject.method2(100));
        System.out.println(targetObject.method2(100));
        System.out.println(targetObject.method3(200));
    }

    /**
     * 懒加载 测试
     */
    private static void test3(){
        //初始化
        LazyBean hh = new LazyBean("hh", 1);
        //因为没有访问所以不触发加载
        System.out.println(hh.getAge());

        //触发懒加载
        System.out.println(hh.toString());

        //PropertyBean触发过一次 就不再触发了
        System.out.println(hh.getPropertyBean().getKey());

        //PropertyBeanDispatcher每次都会触发 懒加载
        System.out.println(hh.getPropertyBeanDispatcher().getKey());

    }
}
