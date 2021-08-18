package com.example.design.patterns.behavior.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
//        Subject subject = new Subject();
//        subject.setMessage("你好!");
//
//        ConcreteObserver concreteObserver = new ConcreteObserver();
//        subject.addObserver(concreteObserver);

        MyObservable observable = new MyObservable();
        observable.addObserver(new MyObsever1());
        observable.addObserver(new MyObsever2());
        observable.setChanged();
        observable.notifyObservers("被修改了");
    }

    public static class Subject extends Observable {

        private String message;

        public void setMessage(String msg) {
            this.message = msg;
        }

        public String getMessage() {
            return message;
        }

        public void changed() {
            this.setChanged();
            this.notifyObservers(message); // 推模式
            this.notifyObservers(); // 拉模式
        }

    }


    public static class ConcreteObserver implements Observer {
//        @Override
//        public void update(Observable o, Object arg) {
//
////            System.out.println(arg);
//            System.out.println(((Subject) o).getMessage()); // 获取推模式推送过来的数据
//            System.out.println(((Subject) o).getMessage()); // 拉模式情况下自己去拿数据
//        }

        @Override
        public void update(Observable observable, Object object) {
            System.out.println(object); // 获取推模式推送过来的数据
// System.out.println(((Subject)observable).getMessage()); // 拉模式情况下自己去拿数据
        }
    }


    public static class MyObsever1 implements Observer{
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("MyObsever1观察到" + o.getClass().getSimpleName() + arg);
        }
    }

    public static class MyObsever2 implements Observer{
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("MyObsever2观察到" + o.getClass().getSimpleName() + arg);
        }
    }

    private static class MyObservable extends Observable{
        @Override
        protected synchronized void setChanged() {
            super.setChanged();
        }
    }
}
