package com.gurnish.dependencyinjectionwithspring.Controllers;


import com.gurnish.dependencyinjectionwithspring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {
    @Autowired
    private  final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
