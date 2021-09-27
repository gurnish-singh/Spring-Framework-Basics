package com.gurnish.springcomponentscan.Controllers;

import com.gurnish.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    GreetingService greetingService;

    public MyController(@Qualifier("language") GreetingService greetingService) {
        this.greetingService = greetingService;

    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
