package com.panpan.chainresponsibility.v3;

/**
 * @className: Main
 * @Decsription: 责任链模式
 *  https://javaee.github.io/
 *
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:29
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.setReqStr("大家好, <我叫jack>, 是一名名程序员，每天工作996");
        Response response = new Response();
        response.setRspStr("");
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter());
        filterChain.addFilter(new SensitiveFilter());
        boolean b = filterChain.doFilter(request, response);
        System.out.println(b);
        System.out.println(request.getReqStr());
        System.out.println(response.getRspStr());

    }

}
