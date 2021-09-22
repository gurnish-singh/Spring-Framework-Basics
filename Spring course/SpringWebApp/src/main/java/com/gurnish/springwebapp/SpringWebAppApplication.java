package com.gurnish.springwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebAppApplication.class, args);
    }
///H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:d4be2cd1-f37a-4ea6-8d83-e4cff1fa085d'
    //always check jdbc url in the browser many times its different it should be jdbc:h2:mem:d4be2cd1-f37a-4ea6-8d83-e4cff1fa085d
}
