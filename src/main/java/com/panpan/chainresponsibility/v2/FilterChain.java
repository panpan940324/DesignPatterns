package com.panpan.chainresponsibility.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: FilterChain
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:43
 * @version: 1.0
 */
public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filters.size()) return false;
        Filter filter = filters.get(index);
        index++;
        return filter.doFilter( request, response, filterChain);
    }
}
