package com.gurnish.usingexternalproperties.configurations;

import com.gurnish.usingexternalproperties.pojo.AbsFakedataModel;
import com.gurnish.usingexternalproperties.pojo.FakeJmsdataModel;
import com.gurnish.usingexternalproperties.pojo.FakedataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
public class ExternalPropertiesConfig {
    @Autowired
    Environment env;
    @Value("${gurnish.user}")
    String user;
    @Value("${gurnish.password}")
    String password;
    @Value("${gurnish.url}")
    String url;
    @Value("${gurnish.jms.user}")
    String jmsUsername;
    @Value("${gurnish.jms.password}")
    String jmsPassword;
    @Value("${gurnish.jms.url}")
    String jmsUrl;
    @Bean
    public FakedataModel fakedataModel(){
        FakedataModel FakedataModel =new FakedataModel();
        FakedataModel.setUser(user);
//        absFakedataModel.setUser(env.getProperty("USERNAME"));
       FakedataModel.setPassword(password);
        FakedataModel.setUrl(url);
        return FakedataModel;
    }
    @Bean  ////this doesnt work apparently because i dont know how to make multiple beans of same pojo
    public FakeJmsdataModel fakeJmsdataModel(){
        FakeJmsdataModel fakeJmsdataModel=new FakeJmsdataModel();
        fakeJmsdataModel.setUser(jmsUsername);
        fakeJmsdataModel.setPassword(jmsPassword);
        fakeJmsdataModel.setUrl(jmsUsername);
        return fakeJmsdataModel;
    }


//    @Bean//////this is what allows us to wire up our values
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }
}
