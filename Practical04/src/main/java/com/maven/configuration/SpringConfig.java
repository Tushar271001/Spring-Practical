package com.maven.configuration;

import com.maven.services.UserService;
import com.maven.services.impl.UserServicesImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import java.sql.DriverManager;

@Configuration
@ComponentScan(basePackages = {"com.maven"})


public class SpringConfig {
@Bean
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl( "jdbc:mysql://localhost:3306/spring");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
     JdbcTemplate jd =new JdbcTemplate();
     jd.setDataSource(getDataSource());
     return jd;
    }
    @Bean("userService")
    public UserService userServices(){
        UserServicesImpl us = new UserServicesImpl();
        us.setJdbcTemplate(getJdbcTemplate());
        return us;
    }

}
