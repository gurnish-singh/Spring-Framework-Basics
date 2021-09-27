package com.gurnish.usingspringbeanfactory.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class EnglishGreetingService implements GreetingService{

    private GreetingRepo greetingRepo;

    public EnglishGreetingService(GreetingRepo greetingRepo) {
        this.greetingRepo = greetingRepo;
    }

    @Override
    public String sayGreeting() {
        return greetingRepo.getEnglishGreeting();
    }
}
