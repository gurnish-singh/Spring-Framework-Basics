package com.gurnish.dependencyinjectionwithoutspring.Controllers;

import com.gurnish.dependencyinjectionwithoutspring.services.GreetingService;
import com.gurnish.dependencyinjectionwithoutspring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}