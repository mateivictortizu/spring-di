package com.example.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello world - Setter";
    }
}