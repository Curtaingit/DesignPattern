package com.curtain.study._3struct._1adapter;

/**
 * 适配器模式
 * 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * 主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
 * 如下：适配器中使用Turkey对象、实现Duck接口  产生了一个会鸭子叫（功能） 但本身还是火鸡（turkey）
 *
 * @author Curtain
 * @date 2018/7/17 16:29
 */
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
