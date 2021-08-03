package com.example.design.patterns.base.interfaces.impl;

import com.example.design.patterns.base.interfaces.Filter;

/**
 * @Description:
 * @Date: 2021/7/20 12:55
 */
public class AuthencationFilter implements Filter {
    @Override
    public void preFilter() {

    }

    @Override
    public void doFilter() {

    }

    @Override
    public void doFilter(RpcRequest req) {
        System.out.println("鉴权逻辑!");
    }

    @Override
    public void postFilter() {

    }
}
