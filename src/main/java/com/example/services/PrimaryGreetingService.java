package com.example.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class PrimaryGreetingService implements GreetingService{

    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository=greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getEnglishGreeting();
    }
}
