package com.gurnish.usingspringbeanfactory;

import com.gurnish.usingspringbeanfactory.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UsingSpringBeanFactoryApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(UsingSpringBeanFactoryApplication.class, args);
        MyController myController=(MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());
    }

}
