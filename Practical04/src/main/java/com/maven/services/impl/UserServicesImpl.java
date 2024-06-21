package com.maven.services.impl;

import com.maven.entities.User;
import com.maven.services.UserService;
import lombok.Data;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Data
public class UserServicesImpl implements UserService {
    private JdbcTemplate jdbcTemplate;

    public int createUser(User user) {
        String query= "insert into userinfo (userID,userName,userContact,userCity)values(?,?,?,?)";
        return jdbcTemplate.update(query, user.getUserID(),user.getUserName(),user.getUserContact(),user.getUserCity());
    }

    @Override
    public int updateUser(User user) {
        String query ="UPDATE userinfo SET userName = ?, userCity = ? WHERE userID =?";
        return jdbcTemplate.update(query,user.getUserName(),user.getUserCity(),user.getUserID());
    }

    @Override
    public int deleteUser(User user) {
        String query = "DELETE FROM userinfo WHERE userID = ?";
        return jdbcTemplate.update(query,user.getUserID());
    }

    @Override
    public List<User> selectUser() {
        String query = "SELECT * FROM userinfo";
        List<User> u = jdbcTemplate.query(query, new RowMapperImpl());
        return u;
    }

    @Override
    public User selectSingleUser(Long id ) {
        String query = "SELECT * FROM userinfo WHERE userID = ?";
        return jdbcTemplate.queryForObject(query, new RowMapperImpl(),id);
    }

    @Override
    public Boolean isUserExits(User user) {
        String query = "SELECT * FROM userinfo WHERE  userContact = ?";
        RowMapperImpl row = new RowMapperImpl();
        try {
            User u = jdbcTemplate.queryForObject(query, row, user.getUserContact());
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }
}
