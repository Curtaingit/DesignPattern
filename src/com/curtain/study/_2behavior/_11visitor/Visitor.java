package com.curtain.study._2behavior._11visitor;

/**
 * @author Curtain
 * @date 2018/7/16 9:00
 */
public interface Visitor {

    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);

}
