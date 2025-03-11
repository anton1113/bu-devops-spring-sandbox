package com.bu.db.budevopsspringsandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from DevOps basics! (Version 1.02)";
    }
}
