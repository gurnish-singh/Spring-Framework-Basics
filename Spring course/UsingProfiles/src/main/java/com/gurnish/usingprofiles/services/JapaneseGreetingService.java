package com.gurnish.usingprofiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("language")
@Profile({"JPN","default"})/////specifying that this is the default service to use if
///profile is not set in the application.properties
public class JapaneseGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Konichiva";
    }
}
