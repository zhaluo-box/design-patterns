package com.example.design.patterns.behavior.observer.test;

import com.example.design.patterns.behavior.observer.interfaces.RegObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2021/7/22 13:06
 */
public class UserController {
//    private UserService userService; // 依赖注入
    private List<RegObserver> regObservers = new ArrayList<>();
    // 一次性设置好，之后也不可能动态的修改
    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }
    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
//        long userId = userService.register(telephone, password);
        long userId=11111;
        for (RegObserver observer : regObservers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}
