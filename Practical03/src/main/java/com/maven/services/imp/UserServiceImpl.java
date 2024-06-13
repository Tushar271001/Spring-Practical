package com.maven.services.imp;

import com.maven.entites.User;
import com.maven.repositories.UserRepositories;
import com.maven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositories userRepositories;
    @Override
    public User createUser(User user) throws SQLException, ClassNotFoundException {
       return userRepositories.insertUser(user);
    }

    @Override
    public List<User> getAllUser(String userCity) throws SQLException, ClassNotFoundException {
        return userRepositories.selectUser(userCity);
    }

    @Override
    public void deleteUser(Long id) throws SQLException, ClassNotFoundException {
        userRepositories.deleteUser(id);
    }

    @Override
    public User updateUser(User user) throws SQLException, ClassNotFoundException {
         return userRepositories.updateUser(user);
    }

    @Override
    public Boolean isUserExits(User user) throws SQLException, ClassNotFoundException {
        return userRepositories.selectUserbyUsernameOrUserContact(user);
    }


}
