package com.curtain.study._1creational._4prototype;

/**
 * @author Curtain
 * @date 2018/7/4 9:20
 */
public class ConcretePrototype extends Prototype {

    private String filed;

    public ConcretePrototype(String filed){
        this.filed=filed;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }

}
