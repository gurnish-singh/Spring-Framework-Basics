package com.gurnish.usingprofiles;


import com.gurnish.usingprofiles.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UsingProfilesApplication {

    public static void main(String[] args) {
        ////u can specify which profile to use in applicaion.properties when there is confusion regarding Qualifiers
        ApplicationContext ctx= SpringApplication.run(UsingProfilesApplication.class, args);
        MyController myController=(MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

    }

}
