package com.example.design.patterns.behavior.observer.interfaces.impl;

import com.example.design.patterns.behavior.observer.domain.Message;
import com.example.design.patterns.behavior.observer.interfaces.Observer;

/**
 *
 * , java.util.Observer
 * @Description:
 * @Date: 2021/7/22 12:54
 */
public class ConcreteObserverTwo  implements Observer  {
    @Override
    public void update(Message message) {
        //TODO: 获取消息通知，执行自己的逻辑...
        System.out.println("ConcreteObserverTwo is notified.");
    }

}
