package com.gurnish.usingspringbeanfactory.configuration;

import com.gurnish.usingspringbeanfactory.services.GreetingRepo;
import com.gurnish.usingspringbeanfactory.services.GreetingService;
import com.gurnish.usingspringbeanfactory.services.GreetingServiceBeenFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetinServiceConfig {
    @Bean
    GreetingServiceBeenFactory greetingServiceBeenFactory(GreetingRepo greetingRepo){
        return new GreetingServiceBeenFactory(greetingRepo);
    }

    @Bean
    @Profile({"EN","default"})
    GreetingService english(GreetingServiceBeenFactory greetingServiceBeenFactory){
        return greetingServiceBeenFactory.chooseGreetingService("EN");
    }
    @Bean
    @Profile({"JPN"})
    GreetingService japanese(GreetingServiceBeenFactory greetingServiceBeenFactory){
        return greetingServiceBeenFactory.chooseGreetingService("JPN");
    }

}
