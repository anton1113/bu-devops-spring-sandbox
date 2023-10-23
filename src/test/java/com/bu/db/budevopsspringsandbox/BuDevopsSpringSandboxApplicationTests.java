package com.bu.db.budevopsspringsandbox;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class BuDevopsSpringSandboxApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void isHolyday() {
        LocalDate holyday = LocalDate.parse("2023-12-10");
        assert LocalDate.now().isAfter(holyday);
    }

}
