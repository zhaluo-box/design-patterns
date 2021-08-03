package com.example.design.patterns.behavior.observer.interfaces;

import com.example.design.patterns.behavior.observer.domain.Message;

/**
 * @Description: 被观察者
 * @Date: 2021/7/22 12:51
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
