package com.training.peam.dependencyinjection_demo.config;

import com.training.peam.dependencyinjection_demo.examplebeans.FakeDataSource;
import com.training.peam.dependencyinjection_demo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.url}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUser;

    @Value("${guru.jms.jmsPassword}")
    String jmsPassword;

    @Value("${guru.jms.jms_Url}")
    String jms_Url;

     @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setJmsUserName(jmsUser);
        fakeJmsBroker.setJmsPassword(jmsPassword);
        fakeJmsBroker.setJms_Url(jms_Url);
        return fakeJmsBroker;
    }

}
