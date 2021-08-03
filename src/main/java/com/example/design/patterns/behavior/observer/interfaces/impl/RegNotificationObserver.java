package com.example.design.patterns.behavior.observer.interfaces.impl;

import com.example.design.patterns.behavior.observer.interfaces.NotificationService;
import com.example.design.patterns.behavior.observer.interfaces.RegObserver;

/**
 * @Description:
 * @Date: 2021/7/22 13:04
 */
public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }

}
