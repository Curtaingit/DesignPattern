package com.curtain.study._3struct._6flyweight;

/**
 * 享元模式
 * 解决:  在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
 * 使用：1、系统中有大量对象。 2、这些对象消耗大量内存。 3、这些对象的状态大部分可以外部化。 4、这些对象可以按照内蕴状态分为很多组，
 *      当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替。 5、系统不依赖于这些对象身份，这些对象是不可分辨的。
 * 优点：  大大减少对象的创建，降低系统的内存，使效率提高。
 * @author Curtain
 * @date 2018/7/23 17:02
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("AA");
        Flyweight flyweight2 = factory.getFlyweight("AA");
        flyweight1.doOperation("X");
        flyweight2.doOperation("Y");
    }
}
