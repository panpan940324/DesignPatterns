package com.panpan.chainresponsibility;

/**
 * @className: Main
 * @Decsription: 责任链模式
 *
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:29
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setName("jack");
        msg.setMsg("大家好, <我叫jack>, 是一名名程序员，每天工作996");
        FilterChain filterChain = new FilterChain();
        boolean b = filterChain.doFiler(msg);
        System.out.println(b);
        System.out.println(msg.getMsg());
    }

}
