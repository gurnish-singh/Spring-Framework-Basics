package com.gurnish.usingexternalproperties.configurations;

import com.gurnish.usingexternalproperties.pojo.FakedataModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class ExternalPropertiesConfig {
    @Value("${gurnish.user}")
    String user;
    @Value("${gurnish.password}")
    String password;
    @Value("${gurnish.url}")
    String url;
    @Bean
    public FakedataModel fakedataModel(){
        FakedataModel fakedataModel=new FakedataModel();
        fakedataModel.setUser(user);
        fakedataModel.setPassword(password);
        fakedataModel.setUrl(url);
        return fakedataModel;
    }
//    @Bean//////this is what allows us to wire up our values
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }
}
