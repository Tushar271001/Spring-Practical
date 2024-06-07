package com.maven.connection;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component
public class DbConnection {



    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        final String URL = "jdbc:mysql://localhost:3306/spring";
        final String USER = "root";
        final String PASS = "root";
        return DriverManager.getConnection(URL, USER, PASS);
    }

}
