package com.cph.AirportTestProgram.administration.repository;

import com.cph.AirportTestProgram.models.Flight;
import com.cph.AirportTestProgram.models.Station;
import com.cph.AirportTestProgram.models.StationInfo;
import com.cph.AirportTestProgram.persistence.sql.ConnectionFactory;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to see all information on flights
 */

public class AdminRepo {

    public AdminRepo(){}

    private final String SELECT_ALL_STALLS = "SELECT * FROM station";
    private final String SELECT_ALL_STALLS_WITH_FLIGHTS = "SELECT flight.route_number, station.id "
    + "FROM flight__station JOIN station ON flight__station.fk_station_id = station.id "
    + "JOIN flight ON flight.id = flight__station.fk_flight_id "
    + "WHERE flight__station.reserved_to IS NULL";
    private final String SELECT_ALL_FLIGHTS = "SELECT * FROM flight";
    private final String UPDATE_DEPARTURE_ON_FLIGHT = "UPDATE departure_offset FROM flight WHERE route_number =?";
    private final String SELECT_ONE_FLIGHT = "SELECT * FROM flight WHERE route_number=?";

    public List<Flight> seeAllFlightInfo()
    {
        List<Flight> flights = new ArrayList<>();

        try {
            Connection conn = ConnectionFactory.createNewConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(SELECT_ALL_FLIGHTS);


            while(res.next())
            {
                int id = res.getInt("id");
                String serialNo = res.getString("route_number");
                Timestamp arrival = res.getTimestamp("arrival_time");
                Timestamp depature = res.getTimestamp("departure_time");
                int arrivalOffset = res.getInt("arrival_offset");
                int departureOffset = res.getInt("departure_offset");
                String fromDestination = res.getString("from_destination");
                String toDestination = res.getString("to_destination");
                int planeSize = res.getInt("plane_size");

                LocalDateTime arrival1 = arrival.toLocalDateTime();
                LocalDateTime depature1 = depature.toLocalDateTime();

                flights.add(new Flight(id, serialNo, arrival1, depature1, arrivalOffset, departureOffset, fromDestination, toDestination, planeSize));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return flights;
    }

    public List<StationInfo> seeAllOccupiedStations()
    {
        List<StationInfo> stations = new ArrayList<>();

        try {
            Connection conn = ConnectionFactory.createNewConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(SELECT_ALL_STALLS_WITH_FLIGHTS);


            while(res.next())
            {

                String serialNo = res.getString("route_number");
                int stationId = res.getInt("id");

                stations.add(new StationInfo(stationId, serialNo));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return stations;
    }

    public List<Station> seeAllStations()
    {
        List<Station> stations = new ArrayList<>();


        try {
            Connection conn = ConnectionFactory.createNewConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(SELECT_ALL_STALLS);


            while(res.next())
            {
                int id = res.getInt("id");
                boolean isActive = res.getBoolean("active");
                int type = res.getInt("station_type");

                stations.add(new Station(id, isActive, type));

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stations;

    }

    public void changeDeparture(int delayedInMinutes) {

        try {
            Connection conn = ConnectionFactory.createNewConnection();
            PreparedStatement st = conn.prepareStatement(UPDATE_DEPARTURE_ON_FLIGHT);
            st.setInt(1, delayedInMinutes);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Flight seeOneFlight(String routeNumber)
    {
        Flight flight = new Flight();

        try {
            Connection conn = ConnectionFactory.createNewConnection();
            PreparedStatement st = conn.prepareStatement(SELECT_ONE_FLIGHT);
            st.setString(1, routeNumber);
            ResultSet res = st.executeQuery();

            while (res.next())
            {
                int id = res.getInt("id");
                String serialNo = res.getString("route_number");
                Timestamp arrival = res.getTimestamp("arrival_time");
                Timestamp depature = res.getTimestamp("departure_time");
                int arrivalOffset = res.getInt("arrival_offset");
                int departureOffset = res.getInt("departure_offset");
                String fromDestination = res.getString("from_destination");
                String toDestination = res.getString("to_destination");
                int planeSize = res.getInt("plane_size");

                LocalDateTime arrival1 = arrival.toLocalDateTime();
                LocalDateTime depature1 = depature.toLocalDateTime();

                flight.setId(id);
                flight.setSerialNo(serialNo);
                flight.setArrivalTime(arrival1);
                flight.setDepartureTime(depature1);
                flight.setArrivalOffset(arrivalOffset);
                flight.setDepartureOffset(departureOffset);
                flight.setFromDestination(fromDestination);
                flight.setToDestination(toDestination);
                flight.setPlaneSize(planeSize);

            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flight;

    }
}
