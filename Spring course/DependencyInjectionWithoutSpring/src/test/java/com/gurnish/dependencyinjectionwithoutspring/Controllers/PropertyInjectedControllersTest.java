package com.gurnish.dependencyinjectionwithoutspring.Controllers;

import com.gurnish.dependencyinjectionwithoutspring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllersTest {
    PropertyInjectedControllers controllers;

    @BeforeEach
    void setUp() {
        controllers=new PropertyInjectedControllers();
        controllers.greetingService=new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controllers.getGreeting());

    }
}