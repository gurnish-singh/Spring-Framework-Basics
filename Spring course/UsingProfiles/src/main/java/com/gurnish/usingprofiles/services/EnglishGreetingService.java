package com.gurnish.usingprofiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("language")
@Profile("EN")
public class EnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "HEllo";
    }
}
