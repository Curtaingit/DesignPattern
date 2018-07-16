package com.curtain.study._2behavior._11visitor;

/**
 * @author Curtain
 * @date 2018/7/16 9:11
 */
public class GeneralReport implements Visitor {

    private int customerNo;
    private int ordersNo;
    private int itemsNo;

    @Override
    public void visit(Customer customer) {
        System.out.println(customer.getName());
        customerNo++;
    }

    @Override
    public void visit(Order order) {
        System.out.println(order.getName());
        ordersNo++;
    }

    @Override
    public void visit(Item item) {
        System.out.println(item.getName());
        itemsNo++;
    }

    public void displayResults(){
        System.out.println("Number of customer: " + customerNo);
        System.out.println("Number of orders: " + ordersNo);
        System.out.println("Number of items: " + itemsNo);
    }
}
