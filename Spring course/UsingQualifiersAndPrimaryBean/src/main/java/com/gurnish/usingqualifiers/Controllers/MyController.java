package com.gurnish.usingqualifiers.Controllers;

import com.gurnish.usingqualifiers.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;

    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
