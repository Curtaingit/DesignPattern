package com.curtain.study._2behavior._4iterator;

/**
 * @author Curtain
 * @date 2018/7/6 15:03
 */
public class ConcreteAggregate implements Aggregate {

    private Integer[] items;

    public ConcreteAggregate(){
        items = new Integer[10];
        for (int i=0;i<items.length;i++){
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }

    @Override
    public Iterator createIterator(Integer[] items) {
        return new ConcreteIterator<Integer>(items);
    }
}
