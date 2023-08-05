package com.example.di.config;

import com.example.services.GreetingRepository;
import com.example.services.GreetingService;
import com.example.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository)
    {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Profile("en")
    @Primary
    GreetingService greetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Profile("es")
    @Primary
    GreetingService greetingESService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Profile("de")
    @Primary
    GreetingService greetingDEService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("de");
    }
}
