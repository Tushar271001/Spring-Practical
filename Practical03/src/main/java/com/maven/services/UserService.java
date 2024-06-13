package com.maven.services;

import com.maven.entites.User;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public interface UserService {
    User createUser(User user) throws SQLException, ClassNotFoundException;

    List<User> getAllUser(String userCity) throws SQLException, ClassNotFoundException;

    void deleteUser(Long id) throws SQLException, ClassNotFoundException;

    User updateUser(User user) throws SQLException, ClassNotFoundException;

    Boolean isUserExits(User user) throws SQLException, ClassNotFoundException;

}
