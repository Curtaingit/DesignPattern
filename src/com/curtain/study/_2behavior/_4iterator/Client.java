package com.curtain.study._2behavior._4iterator;

/**
 * 迭代器
 * 提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示。
 * Aggregate 是聚合类，其中 createIterator() 方法可以产生一个 Iterator；
 * Iterator 主要定义了 hasNext() 和 next() 方法。
 * Client 组合了 Aggregate，为了迭代遍历 Aggregate，也需要组合 Iterator。
 * @author Curtain
 * @date 2018/7/6 15:26
 */
public class Client {

    public static void main(String[] args) {

        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();

//        Integer[] items = new Integer[2];
//        for (int i=0;i<items.length;i++){
//            items[i] = i;
//        }
//        Iterator<Integer> iterator = aggregate.createIterator(items);



        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
