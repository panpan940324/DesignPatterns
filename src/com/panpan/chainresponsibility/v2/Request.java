package com.panpan.chainresponsibility.v2;

/**
 * @className: Request
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/8 23:49
 * @version: 1.0
 */
public class Request {
    private String reqStr;

    public String getReqStr() {
        return reqStr;
    }

    public void setReqStr(String reqStr) {
        this.reqStr = reqStr;
    }

    @Override
    public String toString() {
        return "Request{" +
                "reqStr='" + reqStr + '\'' +
                '}';
    }
}
