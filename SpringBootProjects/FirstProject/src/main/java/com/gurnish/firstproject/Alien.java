package com.gurnish.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//@Scope(value = "prototype")///by default it is singleton creates only onr object
public class Alien {
    private int aid;
    private String aname;
    private String tech;
    @Autowired
private Computer laptop;
    public Alien() {
        System.out.println("object created");
    }

    public void display(){
        System.out.println("hello world");
        laptop.compile();
    }


}
