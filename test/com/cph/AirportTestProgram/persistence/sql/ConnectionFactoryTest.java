package com.cph.AirportTestProgram.persistence.sql;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionFactoryTest {

    @Test
    void createNewConnection() {
        //make null connection
        Connection connection = null;
        try {
            //attempt to create a new connection, if it fails, the test fails because it remains null
            connection = ConnectionFactory.createNewConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //assert connection to not be null
        assertNotNull(connection);
    }
}