package com.panpan.chainresponsibility.v2;

/**
 * @className: Response
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/8 23:50
 * @version: 1.0
 */
public class Response {
    private String rspStr;

    public String getRspStr() {
        return rspStr;
    }

    public void setRspStr(String rspStr) {
        this.rspStr = rspStr;
    }

    @Override
    public String toString() {
        return "Response{" +
                "rspStr='" + rspStr + '\'' +
                '}';
    }
}
