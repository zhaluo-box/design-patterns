package com.example.design.patterns.behavior.observer.interfaces.impl;

import com.example.design.patterns.behavior.observer.interfaces.PromotionService;
import com.example.design.patterns.behavior.observer.interfaces.RegObserver;

/**
 * @Author: wmz
 * @Description:
 * @Date: 2021/7/22 13:02
 */
public class RegPromotionObserver implements RegObserver {

    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
