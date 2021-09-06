package com.example.design.patterns.creational.single.log;

public class OrderController {

    private Logger log = new Logger();

    public void create(String order) {
        log.log(order);
    }

}
