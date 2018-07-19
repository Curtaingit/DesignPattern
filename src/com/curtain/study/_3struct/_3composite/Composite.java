package com.curtain.study._3struct._3composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Curtain
 * @date 2018/7/19 8:41
 */
public class Composite extends Component {
    private List<Component> child;

    public Composite(String name) {
        super(name);
        child = new ArrayList<>();
    }

    @Override
    void print(int level) {
        for (int i=0;i<level;i++){
            System.out.print("--");
        }
        System.out.println("Composite:"+name);
        for (Component component:child){
            component.print(level+1);
        }
    }

    @Override
    public void add(Component component) {
        child.add(component);
    }

    @Override
    public void remove(Component component) {
        child.add(component);
    }
}
