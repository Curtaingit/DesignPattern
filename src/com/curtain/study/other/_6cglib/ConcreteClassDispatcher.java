package com.curtain.study.other._6cglib;

import net.sf.cglib.proxy.Dispatcher;

/**
 * @author Curtain
 * @date 2018/8/10 17:10
 */
public class ConcreteClassDispatcher implements Dispatcher {
    @Override
    public Object loadObject() throws Exception {
        System.out.println("before Dispatcher...");
        PropertyBean propertyBean = new PropertyBean();
        propertyBean.setKey("xxx");
        propertyBean.setValue(new TargetObject());
        System.out.println("after Dispatcher");
        return propertyBean;
    }
}
