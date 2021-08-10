package com.gurnish.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {

       ConfigurableApplicationContext context= SpringApplication.run(FirstProjectApplication.class, args);
        Alien a=context.getBean(Alien.class);
        a.display();

    }

}
