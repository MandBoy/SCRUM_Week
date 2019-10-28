package com.cph.AirportTestProgram.persistence.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //change these values to fit actual database configuration
    private static final String connectionUrl = "jdbc:mysql://localhost:3306/cph?serverTimezone=UTC";
    private static final String username = "cph";
    private static final String password = "123";

    public ConnectionFactory(){}

    public static Connection createNewConnection() throws SQLException {
        return DriverManager.getConnection(connectionUrl, username, password);
    }
}
