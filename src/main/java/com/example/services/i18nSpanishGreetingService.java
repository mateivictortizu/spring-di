package com.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class i18nSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hola Mundo - ES";
    }
}
