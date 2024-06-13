package com.maven.repositories;

import com.maven.connection.DbConnection;
import com.maven.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepositories {
    @Autowired
    private DbConnection connection;


    public User insertUser(User user) throws SQLException, ClassNotFoundException {
        Connection conn = connection.getConnection();
        String sql = "insert into user (id, username, usercontact, usercity) values (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setLong(1, user.getUserId());
        ps.setString(2, user.getUsername());
        ps.setString(3, user.getUserContact());
        ps.setString(4, user.getUserCity());
        ps.execute();
        conn.close();
        return user;


    }

    public List<User> selectUser(String userCity) throws SQLException, ClassNotFoundException {
        Connection conn = connection.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE userCity =? OR username =?");
        ps.setString(1, userCity);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        List<User> userList = new ArrayList<>();
        while (rs.next()) {
            User user = new User();
            user.setUserId(rs.getLong(1));
            user.setUsername(rs.getString(2));
            user.setUserContact(rs.getString(3));
            user.setUserCity(rs.getString(4));
            userList.add(user);
        }
        return userList;
    }

    public void deleteUser(Long id) throws SQLException, ClassNotFoundException {
        Connection conn = connection.getConnection();
        PreparedStatement ps = conn.prepareStatement("DELETE FROM user WHERE id = ?");
        ps.setLong(1, id);
        ps.execute();
        conn.close();

    }

    public User updateUser(User user) throws SQLException, ClassNotFoundException {
        Connection conn = connection.getConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE user SET username = ?, usercity = ? WHERE id =?");
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getUserCity());
        ps.setLong(3, user.getUserId());
        ps.execute();
        conn.close();
        return user;
    }

    public Boolean selectUserbyUsernameOrUserContact(User user) throws SQLException, ClassNotFoundException {
        Connection conn = connection.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE username =? OR usercontact =?");
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getUserContact());
        ps.execute();
        ResultSet rs = ps.getResultSet();
        return (rs.next());
    }
}
