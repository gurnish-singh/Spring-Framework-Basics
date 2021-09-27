package com.gurnish.usingspringbeanfactory.services;

public class GreetingServiceBeenFactory {
    private GreetingRepo greetingRepo;

    public GreetingServiceBeenFactory(GreetingRepo greetingRepo) {
        this.greetingRepo = greetingRepo;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "EN":
                return new EnglishGreetingService(greetingRepo);
            case "JPN":
                return  new JapaneseGreetingService(greetingRepo);
            default:
                return new EnglishGreetingService(greetingRepo);
        }
    }
}
