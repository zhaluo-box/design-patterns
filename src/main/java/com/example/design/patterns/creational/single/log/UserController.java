package com.example.design.patterns.creational.single.log;


public class UserController {
    private Logger log = new Logger();

    public void login(String username, String password) {
        log.log(username + password);
    }
}
