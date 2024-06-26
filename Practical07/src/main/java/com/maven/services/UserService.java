package com.maven.services;


import com.maven.entities.User;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component

public interface UserService {

    Serializable addUser(User user);

   User selectUser (User user);

   List<User> selectAllUser(User user);

   public void deleteUser (User user);
}
