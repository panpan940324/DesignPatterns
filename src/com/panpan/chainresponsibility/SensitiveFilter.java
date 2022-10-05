package com.panpan.chainresponsibility;

/**
 * @className: SensitiveFilter
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:42
 * @version: 1.0
 */
public class SensitiveFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        msg.setMsg(msg.getMsg().replace("996", "995"));
        return true;
    }
}
