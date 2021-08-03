package com.example.design.patterns.behavior.observer.test;

import com.example.design.patterns.behavior.observer.domain.Message;
import com.example.design.patterns.behavior.observer.interfaces.impl.ConcreteObserverOne;
import com.example.design.patterns.behavior.observer.interfaces.impl.ConcreteObserverTwo;
import com.example.design.patterns.behavior.observer.interfaces.impl.ConcreteSubject;

/**
 * @Description:
 * @Date: 2021/7/22 12:57
 */
public class ObserverTest {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new Message());
    }
}
