package com.example.services;

public class PrimarySpanishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;
    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository=greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getSpanishGreeting();
    }
}
