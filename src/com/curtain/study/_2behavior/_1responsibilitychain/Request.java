package com.curtain.study._2behavior._1responsibilitychain;

/**
 * @author Curtain
 * @date 2018/7/4 10:03
 */
public class Request {
    private RequestType type;
    private String name;

    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }

    public RequestType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
