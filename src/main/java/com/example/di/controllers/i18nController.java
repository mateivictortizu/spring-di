package com.example.di.controllers;

import com.example.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class i18nController {
    private final GreetingService greetingService;


    public i18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreetings();

    }
}
