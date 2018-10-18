package com.curtain.study.other._6cglib;

import net.sf.cglib.proxy.LazyLoader;

import java.awt.peer.LabelPeer;

/**
 * @author Curtain
 * @date 2018/8/10 17:07
 */
public class ConcreteClassLazyLoader implements LazyLoader {
    @Override
    public Object loadObject() throws Exception {
        System.out.println("before lazyLoader");
        PropertyBean propertyBean = new PropertyBean();
        propertyBean.setKey("curtain");
        propertyBean.setValue(new TargetObject());
        System.out.println("after lazyLoader");
        return propertyBean;
    }
}
