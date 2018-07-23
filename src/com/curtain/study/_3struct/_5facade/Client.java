package com.curtain.study._3struct._5facade;

/**
 * 外观设计模式
 * 使用：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 优点：降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
 *
 * @author Curtain
 * @date 2018/7/23 16:28
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchMovie();
    }
}
