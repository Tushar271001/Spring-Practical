package com.maven.services;

import com.maven.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
  public int createUser(User user);

  public int updateUser(User user);

  public int deleteUser(User user);

  List<User> selectUser();

  User selectSingleUser(Long id);

  Boolean checkUserbyContact(User user);
}


