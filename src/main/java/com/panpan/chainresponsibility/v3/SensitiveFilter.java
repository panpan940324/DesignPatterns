package com.panpan.chainresponsibility.v3;

/**
 * @className: SensitiveFilter
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:42
 * @version: 1.0
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.setReqStr(request.getReqStr().replace("996", "995"));
        filterChain.doFilter(request, response);
        response.setRspStr(response.getRspStr() + "SensitiveFilter response");
        return true;
    }
}
