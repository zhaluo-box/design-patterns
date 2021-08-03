package com.example.design.patterns.behavior.observer.eventbus.service;

import com.example.design.patterns.behavior.observer.interfaces.PromotionService;
import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Service;

/**
 * @Author: wmz
 * @Description:
 * @Date: 2021/7/29 12:48
 */
@Service
public class RegPromotionObserver {
    private PromotionService promotionService; // 依赖注入
    @Subscribe
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
