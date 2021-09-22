package com.gurnish.dependencyinjectionwithspring.Controllers;


import com.gurnish.dependencyinjectionwithspring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedControllers {
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
       return greetingService.sayGreeting();
    }
}
