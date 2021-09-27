package com.gurnish.usingspringbeanfactory.Controllers;

import com.gurnish.usingspringbeanfactory.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    GreetingService greetingService;

    public MyController( GreetingService greetingService) {
        this.greetingService = greetingService;

    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
