package com.gurnish.usingqualifiers;

import com.gurnish.usingqualifiers.Controllers.ConstructorInjectedController;
import com.gurnish.usingqualifiers.Controllers.PropertyInjectedControllers;
import com.gurnish.usingqualifiers.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UsingQualifiersApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(UsingQualifiersApplication.class, args);
        System.out.println("--------Property based");
        PropertyInjectedControllers propertyInjectedControllers=(PropertyInjectedControllers) ctx.getBean("propertyInjectedControllers");
        System.out.println(propertyInjectedControllers.getGreeting());

        System.out.println("----------setter based");
        SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------constructor based");
        ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
