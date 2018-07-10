package com.curtain.study._2behavior._5Mediator;

/**
 * 中介者设计模式
 * 集中相关对象之间复杂的沟通和控制方式，降低多个对象和类之间的通信复杂性
 * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * @author Curtain
 * @date 2018/7/10 9:17
 */
public class Client {

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calender calender = new Calender();
        Sprinkler sprinkler = new Sprinkler();
        Mediator mediator = new ConcreteMediator(alarm,coffeePot,calender,sprinkler);

        mediator.doEvent("alarm");
//        alarm.onEvent(mediator);

    }
}
