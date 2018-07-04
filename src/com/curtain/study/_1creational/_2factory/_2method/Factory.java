package com.curtain.study._1creational._2factory._2method;

/**
 * 定义了创建对象的接口，由子类决定要实例化的类
 * 优点：良好的封装性，代码结构清晰
 * 高层模块只需要知道产品的抽象类，符合迪米特法则，我不需要的就不要去交流
 * 也符合依赖倒置原则，只依赖产品类的抽象
 * 当然也符合里氏替换原则，使用产品子类替换产品父类
 * @author Curtain
 * @date 2018/7/3 10:53
 */
public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething(){
        Product product = factoryMethod();
        //product doSomething
        product.show();
    }


}
