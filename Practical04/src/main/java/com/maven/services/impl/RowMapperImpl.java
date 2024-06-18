package com.maven.services.impl;

import com.maven.entities.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user= new User();
        user.setUserID(rs.getLong(1));
        user.setUserName(rs.getString(2));
        user.setUserContact(rs.getString(3));
        user.setUserCity(rs.getString(4));
        return user;
    }
}
