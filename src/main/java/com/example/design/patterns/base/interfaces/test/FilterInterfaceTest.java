package com.example.design.patterns.base.interfaces.test;

import com.example.design.patterns.base.interfaces.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2021/7/20 13:00
 */
public class FilterInterfaceTest {

    private static List<Filter> filters = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void handleRpcRequest(Filter.RpcRequest req) {
        try {
            for (Filter filter : filters) {
                filter.doFilter(req);
            }
        } catch (Exception e) {
            // ...处理过滤结果...
        }
        // ...省略其他处理逻辑...
    }
}
