package com.maven;

import com.maven.configuration.SpringConfig;
import com.maven.entites.User;
import com.maven.repositories.UserRepositories;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserRepositories userRepositories = context.getBean("userRepositories", UserRepositories.class);
        User user = userRepositories.insertUser();


    }
    
}
