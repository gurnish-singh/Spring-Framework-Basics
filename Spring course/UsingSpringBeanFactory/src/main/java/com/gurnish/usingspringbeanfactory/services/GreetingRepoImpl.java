package com.gurnish.usingspringbeanfactory.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepoImpl implements GreetingRepo{


    @Override
    public String getEnglishGreeting() {
        return "Hello";
    }

    @Override
    public String getJapaneseGreeting() {
        return "Konichiva";
    }
}
