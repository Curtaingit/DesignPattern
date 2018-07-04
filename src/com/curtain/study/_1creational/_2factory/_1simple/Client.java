package com.curtain.study._1creational._2factory._1simple;

/**
 * 把客户类和具体子类解耦
 * 如果增加了子类，那么所有的客户类就要进行更改
 * 存在以下这种代码，就需要使用简单工厂将对象实例化
 *
 * @author Curtain
 * @date 2018/7/3 10:29
 */
public class Client {

    public static void main(String[] args) {
        int type = 1;

        Product product;

        if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2) {
            product = new ConcreteProduct2();
        } else {
            product = new ConcreteProduct3();
        }

        //修改后
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createProduct(type);

    }
}
