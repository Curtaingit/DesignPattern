package com.curtain.study._2behavior._11visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Curtain
 * @date 2018/7/16 8:55
 */
public class CustomerGroup {
    private List<Customer> customers = new ArrayList<>();

    public void accept(Visitor visitor){
        for (Customer customer:customers){
            customer.accept(visitor);
        }
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }
}
