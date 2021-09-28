package com.gurnish.usingexternalproperties;

import com.gurnish.usingexternalproperties.pojo.AbsFakedataModel;
import com.gurnish.usingexternalproperties.pojo.FakeJmsdataModel;
import com.gurnish.usingexternalproperties.pojo.FakedataModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UsingExternalPropertiesApplication {

    public static void main(String[] args) {

        ApplicationContext ctx= SpringApplication.run(UsingExternalPropertiesApplication.class, args);
       FakedataModel fakedataModel = (FakedataModel) ctx.getBean(FakedataModel.class); //we are using configuration
//        FakedataModel FakedataModel=(FakedataModel) ctx.getBean("fakedataModel") ;
        System.out.println(fakedataModel.getUser());
        System.out.println(fakedataModel.getPassword());
        System.out.println(fakedataModel.getUrl());

        //tried using multiple external properties
        FakeJmsdataModel fakeJmsdataModel=(FakeJmsdataModel) ctx.getBean("fakeJmsdataModel") ;
        System.out.println(fakeJmsdataModel.getUser());
        System.out.println(fakeJmsdataModel.getPassword());
        System.out.println(fakeJmsdataModel.getUrl());

    }

}
