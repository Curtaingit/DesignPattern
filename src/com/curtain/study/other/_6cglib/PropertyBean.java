package com.curtain.study.other._6cglib;

/**
 * @author Curtain
 * @date 2018/8/10 16:49
 */
public class PropertyBean {
    private String key;
    private Object value;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PropertyBean{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
