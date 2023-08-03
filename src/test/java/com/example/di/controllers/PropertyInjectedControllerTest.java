package com.example.di.controllers;

import com.example.di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp()
    {
        controller = new PropertyInjectedController();
        controller.greetingService= new ConstructorGreetingService();
    }

    @Test
    void getGreetings()
    {
        System.out.println(controller.getGreeting());
    }

}