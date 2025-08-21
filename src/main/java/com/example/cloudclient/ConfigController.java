package com.example.cloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${app.message:No message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}