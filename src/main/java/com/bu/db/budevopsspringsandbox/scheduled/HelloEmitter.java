package com.bu.db.budevopsspringsandbox.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloEmitter {

    @Scheduled(fixedRate = 2_000)
    public void sayHello() {
        System.out.println("Hello, DevOps Basics! v4");
    }
}
