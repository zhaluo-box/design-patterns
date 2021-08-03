package com.example.design.patterns.behavior.observer.interfaces;

import com.example.design.patterns.behavior.observer.domain.Message;

/**
 * @Description: 观察者
 * @Date: 2021/7/22 12:47
 */
public interface Observer {
    void update(Message message);
}
