package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello world - Property";
    }
}
