package com.gurnish.dependencyinjectionwithoutspring;

import com.gurnish.dependencyinjectionwithoutspring.Controllers.PropertyInjectedControllers;
import com.gurnish.dependencyinjectionwithoutspring.services.GreetingService;
import com.gurnish.dependencyinjectionwithoutspring.services.GreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionWithoutSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionWithoutSpringApplication.class, args);
        ////with controllers
        PropertyInjectedControllers controllers=new PropertyInjectedControllers();
        controllers.greetingService=new GreetingServiceImpl();
        System.out.println(controllers.getGreeting());
        //////directly using implementation
        GreetingService greetingService=new GreetingServiceImpl();
        System.out.println(greetingService.sayGreeting());
        ////ive written tests for every controller see there
    }

}
