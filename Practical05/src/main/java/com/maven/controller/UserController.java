package com.maven.controller;

import com.maven.entities.User;
import com.maven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserController {
    @Autowired
    UserService userService;

    public   User addUser (User user){
        return  userService.createUser(user);
    }

    public void updateUser(User user){
        userService.updateUser(user);
    }
    public void deleteUser(User user){
        userService.deleteUser(user);
    }
    public User selectUser (User user){
      return   userService.selectUser(user);
    }

    public List<User> selectAllUser(){
        return userService.selectAllUser();
    }

}
