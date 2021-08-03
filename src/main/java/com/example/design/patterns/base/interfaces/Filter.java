package com.example.design.patterns.base.interfaces;

/**
 * @Description:
 * @Date: 2021/7/19 13:00
 */
public interface Filter {

    void preFilter();

    void doFilter();
    void doFilter(RpcRequest req);


    void postFilter();

    public static class RpcRequest{

    }
}
