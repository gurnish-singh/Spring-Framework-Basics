package com.gurnish.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int Lid;
    private String brand;
    public void compile(){
        System.out.println("LAptop");
    }
}
