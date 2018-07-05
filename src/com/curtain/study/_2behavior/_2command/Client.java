package com.curtain.study._2behavior._2command;

/**
 * 命令模式
 * 请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * @author Curtain
 * @date 2018/7/5 9:57
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        invoker.setOnCommand(lightOnCommand,0);
        invoker.setOffCommand(lightOffCommand,0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushd(0);
    }
}
