package com.example.design.patterns.base.abstracts.test;

import com.example.design.patterns.base.abstracts.impl.RateLimitFilter;

/**
 * @Description:
 * @Date: 2021/7/20 12:40
 */
public class FilterTest {
    public static void main(String[] args) {
        RateLimitFilter rateLimitFilter = new RateLimitFilter();
        rateLimitFilter.doFilter();
    }
}
