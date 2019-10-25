package com.cph.groundcontrol.repository;

import com.cph.AirportTestProgram.groundcontrol.repository.GroundRepo;
import com.cph.AirportTestProgram.models.Flight;
import com.cph.AirportTestProgram.persistence.sql.ConnectionFactory;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GroundControlRepoTest extends GroundRepo
{

    @Test
    public void updateFlightStation() {
        int fk_flightId = 1;
        int fk_stationId = 3;

        try {
            Connection connection = ConnectionFactory.createNewConnection();
            PreparedStatement preStatemnt = connection.prepareStatement(UPDATE_FLIGHT_STATION);

            preStatemnt.setInt(1, fk_flightId);
            preStatemnt.setInt(2, fk_stationId);

            preStatemnt.executeQuery();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
