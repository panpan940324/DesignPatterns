package com.panpan.chainresponsibility.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: FilterChain
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 1:43
 * @version: 1.0
 */
public class FilterChain {

    public boolean doFiler(Msg msg) {
        List<Filter> filters = getFilters();
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)) return false;
        }
        return true;
    }

    private List<Filter> getFilters() {
        List<Filter> filters = new ArrayList<>();
        filters.add(new HTMLFilter());
        filters.add(new SensitiveFilter());
        return filters;
    }
}
