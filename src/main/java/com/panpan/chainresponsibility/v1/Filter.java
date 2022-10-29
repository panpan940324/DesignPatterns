package com.panpan.chainresponsibility.v1;

/**
 * @className: Filter
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:38
 * @version: 1.0
 */
public interface Filter {
    boolean doFilter(Msg msg);
}
