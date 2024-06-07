package com.maven.repositories;

import com.maven.connection.DbConnection;
import com.maven.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class UserRepositories {




    public User insertUser() throws SQLException, ClassNotFoundException {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.getConnection();
        String sql = "insert into user (id, username, usercontact, usercity) values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,1);
        ps.setString(2,"Sanket Ilake");
        ps.setString(3,"7057891106");
        ps.setString(4,"Kolhapur");
        ps.execute();
        connection.close();
        return new User();


    }
}
