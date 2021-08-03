package com.example.design.patterns.behavior.observer.interfaces;

/**
 * @Description:
 * @Date: 2021/7/22 13:04
 */
public interface NotificationService {
    void sendInboxMessage(Long userId, String message);
}
