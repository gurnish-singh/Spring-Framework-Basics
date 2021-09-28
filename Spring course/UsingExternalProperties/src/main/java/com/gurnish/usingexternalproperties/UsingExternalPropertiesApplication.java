package com.gurnish.usingexternalproperties;

import com.gurnish.usingexternalproperties.pojo.FakedataModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class UsingExternalPropertiesApplication {

    public static void main(String[] args) {

        ApplicationContext ctx= SpringApplication.run(UsingExternalPropertiesApplication.class, args);
        FakedataModel fakedataModel= (FakedataModel) ctx.getBean(FakedataModel.class); //we are using configuration
//        FakedataModel fakedataModel=(FakedataModel) ctx.getBean("fakedataModel") ;
        System.out.println(fakedataModel.getUser());
        System.out.println(fakedataModel.getPassword());
        System.out.println(fakedataModel.getUrl());
    }

}
