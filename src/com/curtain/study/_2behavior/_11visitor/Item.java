package com.curtain.study._2behavior._11visitor;



/**
 * @author Curtain
 * @date 2018/7/16 9:01
 */
public class Item implements Element {

    private String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public Item(String name){
        this.name = name;
    }
}
