package com.curtain.study._2behavior._1responsibilitychain;

/**
 * @author Curtain
 * @date 2018/7/4 9:57
 */
public abstract class Handler {
    protected  Handler successor;

    public Handler(Handler successor){
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);

}
