package com.Controller.entity;

public class Result {

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据对象
     */
    private Object data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
