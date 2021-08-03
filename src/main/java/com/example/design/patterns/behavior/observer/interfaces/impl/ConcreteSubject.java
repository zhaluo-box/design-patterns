package com.example.design.patterns.behavior.observer.interfaces.impl;

import com.example.design.patterns.behavior.observer.domain.Message;
import com.example.design.patterns.behavior.observer.interfaces.Observer;
import com.example.design.patterns.behavior.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2021/7/22 12:49
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
