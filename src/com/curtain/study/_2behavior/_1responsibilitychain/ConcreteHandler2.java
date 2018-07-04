package com.curtain.study._2behavior._1responsibilitychain;

/**
 * @author Curtain
 * @date 2018/7/4 11:09
 */
public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.type2) {
            System.out.println(request.getName() + " is handle by ConcreteHandler2");
            return;
        }

        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
