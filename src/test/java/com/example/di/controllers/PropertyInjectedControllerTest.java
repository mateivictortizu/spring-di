package com.example.di.controllers;

import com.example.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp()
    {
        controller = new PropertyInjectedController();
        controller.greetingService= new GreetingServiceImpl();
    }

    @Test
    void getGreetings()
    {
        System.out.println(controller.getGreeting());
    }

}