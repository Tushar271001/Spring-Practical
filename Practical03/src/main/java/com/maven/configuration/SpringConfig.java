package com.maven.configuration;

import com.maven.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = {"com.maven.entites","com.maven.repositories"})

public class SpringConfig {
    @Autowired
    private User user;
//    @Bean
//    public User getUser() {
//        user.setUserId(101L);
//        user.setUserName("Tushar Yadav");
//        user.setUserContact("9595143472");
//        user.setUserCity("Kolhapur");
//
//        return user;
//    }
}
