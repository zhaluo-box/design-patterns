package com.example.design.patterns.behavior.observer.myevenbus;

import com.google.common.base.Preconditions;
import org.springframework.util.Assert;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Date: 2021/8/2 11:52
 */
public class ObserverAction {

    private Object target;

    private Method method;

    public ObserverAction(Object target, Method method) {
        Assert.notNull(target, "目标对象为空! target : " + target);
        this.target = Preconditions.checkNotNull(target);
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    public void execute(Object event) { // event是method方法的参数
        try {
            method.invoke(target, event);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
