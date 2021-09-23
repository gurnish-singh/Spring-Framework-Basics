package com.gurnish.usingprofiles.Controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.gurnish.usingprofiles.services.GreetingService;

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
