package com.gurnish.dependencyinjectionwithoutspring.Controllers;

import com.gurnish.dependencyinjectionwithoutspring.services.GreetingService;

public class ConstructorInjectedController {
    private  final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
