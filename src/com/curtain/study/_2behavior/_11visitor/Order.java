package com.curtain.study._2behavior._11visitor;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Curtain
 * @date 2018/7/16 8:58
 */
public class Order implements Element{

    private String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Item item : items){
            item.accept(visitor);
        }
    }

    private List<Item> items = new ArrayList<>();

    public Order(String name){
        this.name = name;
    }

    public Order(String name, String itemName){
        this.name = name;
        addItem(new Item(itemName));
    }

    public void addItem(Item item){
        items.add(item);
    }

    public String getName(){
        return name;
    }


}
