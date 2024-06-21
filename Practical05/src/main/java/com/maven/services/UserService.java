package com.maven.services;

import com.maven.entities.User;

import java.util.List;

public interface UserService {

      User createUser(User user);

    void updateUser (User user);

    void deleteUser (User user);

    User selectUser (User user);

    List<User>selectAllUser ();

}
