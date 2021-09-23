package com.gurnish.usingqualifiers.Controllers;


import com.gurnish.usingqualifiers.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {
    //@Autowired do not use autowired for constructor
    private  final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
