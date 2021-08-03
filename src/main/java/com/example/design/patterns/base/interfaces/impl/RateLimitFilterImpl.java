package com.example.design.patterns.base.interfaces.impl;

import com.example.design.patterns.base.interfaces.Filter;

/**
 * @Author: wmz
 * @Description:
 * @Date: 2021/7/20 12:58
 */
public class RateLimitFilterImpl implements Filter {
    @Override
    public void preFilter() {

    }

    @Override
    public void doFilter() {

    }

    @Override
    public void doFilter(RpcRequest req) {
        System.out.println("限流逻辑!");
    }

    @Override
    public void postFilter() {

    }
}
