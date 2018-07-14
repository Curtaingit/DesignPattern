package com.curtain.study._2behavior._8state;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 状态设计模式
 * 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它所属的类。
 * 以下程序实现了  糖果售卖机，它有多种状态  未投币   已投币  售卖中   售卖完
 * 面向客户的多种功能   投币，退还，取糖果，发放糖果
 * @author Curtain
 * @date 2018/7/13 9:03
 */
public class Client {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
