package com.maven.controller;

import com.maven.entites.User;
import com.maven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

@Component
public class UserController {
    @Autowired
    private UserService userService;
    Scanner x =new Scanner(System.in);

    public User adduser(User user) throws SQLException, ClassNotFoundException {
//        System.out.println("Enter User ID");
//        user.setUserId(x.nextLong());
//        x.nextLine();
//        System.out.println("Enter User Name");
//        user.setUsername(x.nextLine());
//        System.out.println("Enter User City");
//        user.setUserCity(x.nextLine());
//        System.out.println("Enter User Contact");
//        user.setUserContact(x.nextLine());
        userService.createUser(user);
        return user;
    }

    public List<User> getAllUsers() throws SQLException, ClassNotFoundException {
        return userService.getAllUser("Kolhapur");
    }

    public void deleteUser() throws SQLException, ClassNotFoundException {
       userService.deleteUser(1024L);//delete by id
    }

    public User updateUser() throws SQLException, ClassNotFoundException {
        User user =new User();
        user.setUsername("Yash Patil");
        user.setUserCity("Nipani");
        user.setUserId(103L);
        return userService.updateUser(user);

    }
    public boolean isUserExits(User user) throws SQLException, ClassNotFoundException {
        return userService.isUserExits(user);
    }

}
