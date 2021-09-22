package com.gurnish.dependencyinjection;

import com.gurnish.dependencyinjection.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx= SpringApplication.run(DependencyInjectionApplication.class, args);
        //i m not creating an object here
        // i m asking spring to provide me an object of certain type.
        MyController myController= (MyController) ctx.getBean("myController");
        String greeting=myController.sayHello();
        System.out.println(greeting);
    }

}
