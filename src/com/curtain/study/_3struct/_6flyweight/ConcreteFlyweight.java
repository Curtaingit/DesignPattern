package com.curtain.study._3struct._6flyweight;

/**
 * @author Curtain
 * @date 2018/7/23 16:49
 */
public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address:" + System.identityHashCode(this));
        System.out.println("IntrinsicState:"+intrinsicState);
        System.out.println("ExtrinsicState:"+extrinsicState);
    }
}
