package com.panpan.chainresponsibility.v1;

/**
 * @className: HTMLFilter
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:39
 * @version: 1.0
 */
public class HTMLFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("<", "[");
        r = r.replace(">", "]");
        msg.setMsg(r);
        return true;
    }
}
