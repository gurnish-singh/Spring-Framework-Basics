package com.gurnish.dependencyinjectionwithoutspring.Controllers;

import com.gurnish.dependencyinjectionwithoutspring.services.GreetingService;

public class PropertyInjectedControllers {
    public GreetingService greetingService;

    public String getGreeting(){
       return greetingService.sayGreeting();
    }
}
