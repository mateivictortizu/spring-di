package com.example.di.controllers;

import com.example.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello()
    {
        return greetingService.sayGreetings();
    }
}
