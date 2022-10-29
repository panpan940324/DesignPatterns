package com.panpan.chainresponsibility.v3;

/**
 * @className: HTMLFilter
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:39
 * @version: 1.0
 */
public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        String reqStr = request.getReqStr();
        reqStr = reqStr.replace("<", "[");
        reqStr = reqStr.replace(">", "]");
        request.setReqStr(reqStr);

        filterChain.doFilter(request, response);

        String rspStr = response.getRspStr();
        rspStr += "HTMLFilter response";
        response.setRspStr(rspStr);
        return true;
    }
}
