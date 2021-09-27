package com.gurnish.springcomponentscan;

import com.gurnish.springcomponentscan.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gurnish"})//// since Services folder has been moved to a different package
////so we need to specify a base package to search for spring beans outside of current package
public class SpringComponentScanApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringComponentScanApplication.class, args);
        MyController myController=(MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());
    }

}
