package com.gurnish.usingjavaconfiguration.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
////it is mostly used when u don't have control over the source code
////maybe u are using external jars
@Configuration
public class ChuckConfiguration {
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
