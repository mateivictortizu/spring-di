package com.example.services;

public class PrimaryGermanGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;
    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository=greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getGermanGreeting();
    }
}
