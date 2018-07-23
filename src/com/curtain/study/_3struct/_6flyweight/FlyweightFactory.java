package com.curtain.study._3struct._6flyweight;

import java.util.HashMap;

/**
 * @author Curtain
 * @date 2018/7/23 16:58
 */
public class FlyweightFactory {

    private HashMap<String,Flyweight> flyweightHashMap = new HashMap<>();

    Flyweight getFlyweight(String intrinsicState){
        if (!flyweightHashMap.containsKey(intrinsicState)){
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweightHashMap.put(intrinsicState,flyweight);
        }
        return flyweightHashMap.get(intrinsicState);
    }
}
