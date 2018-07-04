package com.curtain.study._2behavior._1responsibilitychain;

/**
 * 责任链模式
 * 使多个对象都有机会处理请求从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。
 * @author Curtain
 * @date 2018/7/4 11:11
 */
public class Client {
    public static void main(String[] args) {
        //handler2 中的successor 保存了 handler1
        //如果handler2处理不了，那么就会调用handler1来处理
        //处理了就return  否则依次 successor为null为止
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        Request request1 = new Request(RequestType.type1,"request1");
        handler2.handleRequest(request1);

        Request request2 = new Request(RequestType.type2, "request2");
        handler2.handleRequest(request2);


    }

}
