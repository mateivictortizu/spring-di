package com.example.di.controllers;

import com.example.di.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreetings();
    }
}
