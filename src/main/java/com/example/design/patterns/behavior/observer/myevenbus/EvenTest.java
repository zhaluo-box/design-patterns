package com.example.design.patterns.behavior.observer.myevenbus;

import com.example.design.patterns.behavior.observer.myevenbus.pojo.AMsg;
import com.example.design.patterns.behavior.observer.myevenbus.pojo.BMsg;

/**
 * @Description:
 * @Date: 2021/8/2 12:15
 */
public class EvenTest {

    private static EventBus eventBus = new EventBus();

    public static void main(String[] args) {
        ObServerService obServerService = new ObServerService();
        eventBus.register(obServerService);
        AMsg aMsg = new AMsg();
        aMsg.setMsg("AMSG ---");
        eventBus.post(aMsg);

        BMsg bMsg = new BMsg();
        bMsg.setMsg("BMSG ---");
        eventBus.post(aMsg);
    }

}

class ObServerService {

    @Subscribe
    public void publish(AMsg msg) {
        System.out.println(msg.toString());
    }

    @Subscribe
    public void publish(BMsg msg) {
        System.out.println(msg.toString());
    }

}

