package com.panpan.chainresponsibility.v1;

/**
 * @className: Msg
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:31
 * @version: 1.0
 */
public class Msg {
    private String name;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
