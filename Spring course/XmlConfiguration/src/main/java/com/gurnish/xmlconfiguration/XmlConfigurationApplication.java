package com.gurnish.xmlconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuckConfig.xml")
public class XmlConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlConfigurationApplication.class, args);
    }

}
