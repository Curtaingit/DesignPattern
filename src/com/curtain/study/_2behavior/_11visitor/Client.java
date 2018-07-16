package com.curtain.study._2behavior._11visitor;

/**
 *  访问者模式
 * 为一个对象结构（比如组合结构）增加新能力。
 * 意图：主要将数据结构与数据操作分离。主要解决：稳定的数据结构和易变的操作耦合问题。
 * @author Curtain
 * @date 2018/7/16 9:20
 */
public class Client {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Customer1");
        customer1.addOrder(new Order("order1","item1"));
        customer1.addOrder(new Order("order2","item1"));
        customer1.addOrder(new Order("order3","item1"));

        Order order = new Order("order_a");
        order.addItem(new Item("item_a1"));
        order.addItem(new Item("item_a2"));
        order.addItem(new Item("item_a3"));

        Customer customer2 = new Customer("Customer2");
        customer2.addOrder(order);

        CustomerGroup customers = new CustomerGroup();
        customers.addCustomer(customer1);
        customers.addCustomer(customer2);

        GeneralReport visitor = new GeneralReport();
        customers.accept(visitor);
        visitor.displayResults();

    }
}
