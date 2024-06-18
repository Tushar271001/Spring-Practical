package com.maven.controller;

import com.maven.entities.User;
import com.maven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component

public class UserController {
    @Autowired
   UserService userService;

    public int addUser(User user){
//        User user=new User();
//        user.setUserName("Sanket Ilkae");
//        user.setUserContact("7057891106");
//        user.setUserCity("Nipani");
        return userService.createUser(user);
    }

    public int updateUser(User user){
//        User user=new User();
//        user.setUserName("Ankur Yadav");
//        user.setUserCity("Pune");
//        user.setUserID(101L);
        return userService.updateUser(user);
    }

    public int deleteUser(User user ){
//        User user=new User();
//        user.setUserID(101L);
        return userService.deleteUser(user);
    }

    public List<User> selectUser(){
        return userService.selectUser();
    }
    public User selectSingleUSer(Long id){
        return userService.selectSingleUser(id);
    }

    public boolean isUserExits(User user)  {
        return userService.checkUserbyContact(user);
    }

}
