package com.cph.AirportTestProgram.groundcontrol.repository;

import com.cph.AirportTestProgram.models.Flight;
import com.cph.AirportTestProgram.persistence.sql.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GroundRepo
{
    /*private final String SELECT_STATIONED_FLIGHTS = "SELECT * FROM cph.flight AS flight WHERE flight.id IN (SELECT fk_flight_id FROM flight__station);";
    private final String SELECT_STATIONS_FROM_PLANESIZE = "SELECT * FROM station WHERE station_type = ?";
    private final String UPDATE_FLIGHT__STATION = "UPDATE flight__station SET fk_station_id = ? WHERE fk_flight_id = ?;";
*/

    protected final String UPDATE_FLIGHT_STATION =
                    "CREATE TEMPORARY TABLE ABC AS " +
                    "SELECT * FROM flight__station " +
                    "WHERE " +
                    "fk_station_id = 3;" +

                    "UPDATE flight__station " +
                    "SET fk_station_id = 3 " +
                    "WHERE fk_flight_id = 1 AND (SELECT COUNT(*) FROM ABC) = 0;" +
                    "DROP TABLE ABC;";



    public void updateFlightStation(int flightId, int stationId) {
        try {
            Connection connection = ConnectionFactory.createNewConnection();
            connection.createStatement();

            //connection.


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





    /*
    public ArrayList<Flight> getStationedFlights() {
        ArrayList<Flight> result = new ArrayList<>();

        try {
            Connection connection = ConnectionFactory.createNewConnection();
            PreparedStatement st = connection.prepareStatement(SELECT_STATIONED_FLIGHTS);
            ResultSet res = st.executeQuery();

            while(res.next()) {
                Flight flight = new Flight();
                flight.setId(res.getInt("id"));
                flight.setSerialNo(res.getString("route_number"));
                flight.setArrivalTime(res.getTimestamp("arrival_time").toLocalDateTime());
                flight.setDepartureTime(res.getTimestamp("departure_time").toLocalDateTime());
                flight.setArrivalOffset(res.getInt("arrival_offset"));
                flight.setDepartureOffset(res.getInt("departure_offset"));
                flight.setFromDestination(res.getString("from_destination"));
                flight.setToDestination(res.getString("to_destination"));
                flight.setPlaneSize(res.getInt("plane_size"));

                result.add(flight);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    */



}
