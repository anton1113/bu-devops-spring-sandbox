package com.bu.db.budevopsspringsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BuDevopsSpringSandboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuDevopsSpringSandboxApplication.class, args);
    }

}
