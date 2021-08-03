package com.example.design.patterns.behavior.observer.eventbus.service;

import com.example.design.patterns.behavior.observer.interfaces.NotificationService;
import com.google.common.eventbus.Subscribe;

/**
 * @Author: wmz
 * @Description:
 * @Date: 2021/7/29 12:48
 */
public class RegNotificationObserver {
    private NotificationService notificationService;
    @Subscribe
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }
}
