package com.cph.persistence.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //change these values to fit actual database configuration
    private static final String connectionUrl = "jdbc:mysql://localhost:3306/lufthavn";
    private static final String username = "root";
    private static final String password = "";

    public ConnectionFactory() { }

    public static Connection createNewConnection() throws SQLException {
        return DriverManager.getConnection(connectionUrl, username, password);
    }
}
