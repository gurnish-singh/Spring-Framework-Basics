package com.gurnish.usingprofiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("language")
@Profile("JPN")
public class JapaneseGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Konichiva";
    }
}
