package com.journalofself.journal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/ping")
    public Map<String, Object> ping() {
        Map<String, Object> ping = new HashMap<>();
        ping.put("health", "good");
        ping.put("status", "up");
        return ping;
    }
}
