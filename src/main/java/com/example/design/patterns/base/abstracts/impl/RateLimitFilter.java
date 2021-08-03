package com.example.design.patterns.base.abstracts.impl;

import com.example.design.patterns.base.abstracts.AbstractFilter;

/**
 * @Author: wmz
 * @Description:
 * @Date: 2021/7/19 13:01
 */
public class RateLimitFilter extends AbstractFilter {

    static {
        System.out.println("RateLimitFilter 静态代码块");
    }

    @Override
    public void doFilter() {
        System.out.println(" RateLimitFilter 限流过滤逻辑!");
    }

    @Override
    public void preFilter() {

    }

    @Override
    public void postFilter() {

    }

    public RateLimitFilter() {
        System.out.println("RateLimitFilter 构造器");
    }


}
