package com.cph.groundcontrol.repository;

import com.cph.AirportTestProgram.groundcontrol.repository.GroundRepo;
import com.cph.AirportTestProgram.models.Flight;
import com.cph.AirportTestProgram.persistence.sql.ConnectionFactory;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class GroundControlRepoTest
{
    protected final String CREATE_TEMP_FS =
            "CREATE TEMPORARY TABLE ABC AS " +
                    "SELECT * FROM flight__station " +
                    "WHERE " +
                    "fk_station_id = ?;";

    protected final String UPDATE_FLIGHT_STATION =
                    "UPDATE flight__station " +
                    "SET fk_station_id = ? " +
                    "WHERE fk_flight_id = ? AND (SELECT COUNT(*) FROM ABC) = 0;";

    protected final String DROP_TEMP_FS =
            "DROP TABLE ABC;";

    @Test
    public void updateFlightStation() {
        int fk_flightId = 1;
        int fk_stationId = 1;


        try {
            Connection connection = ConnectionFactory.createNewConnection();
            PreparedStatement preStatemnt1 = connection.prepareStatement(CREATE_TEMP_FS);
            PreparedStatement preStatemnt2 = connection.prepareStatement(UPDATE_FLIGHT_STATION);

            Statement statement = connection.createStatement();

            preStatemnt1.setInt(1, fk_stationId);

            preStatemnt2.setInt(1, fk_stationId);
            preStatemnt2.setInt(2, fk_flightId);


            preStatemnt1.execute();
            preStatemnt2.execute();
            //statement.executeQuery(DROP_TEMP_FS);




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
