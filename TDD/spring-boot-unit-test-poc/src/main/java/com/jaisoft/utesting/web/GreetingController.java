package com.jaisoft.junit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jaisoft.junit.services.GreetingService;

@Controller
public class GreetingController { 

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public ResponseEntity sayHello() {
        return ResponseEntity.ok(greetingService.helloWorld());
    }
}
