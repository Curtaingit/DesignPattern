package com.curtain.study._2behavior._11visitor;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Curtain
 * @date 2018/7/16 8:57
 */
public class Customer implements Element {

    private String name;
    private List<Order> orders = new ArrayList();

    public String getName() {
        return name;
    }

    public Customer(String name){
        this.name = name;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order:orders){
            order.accept(visitor);
        }
    }
}
