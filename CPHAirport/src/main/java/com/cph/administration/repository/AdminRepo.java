package com.cph.administration.repository;

import com.cph.models.Flight;
import com.cph.models.Station;
import com.cph.models.StationInfo;
import com.cph.persistence.sql.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to see all information on flights
 */

public class AdminRepo {

    public AdminRepo(){}

    private final String SELECT_ALL_STALLS = "SELECT * FROM station";
    private final String SELECT_ALL_STALLS_WITH_FLIGHTS = "SELECT flight.serial_number, station.id "
    + "FROM flight__station JOIN station ON flight__station.fk_station_id = station.id "
    + "JOIN flight ON flight.id = flight__station.fk_flight_id "
    + "WHERE flight__station.reserved_to IS NULL";
    private final String SELECT_ALL_FLIGHTS = "SELECT * FROM flight";


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


                flights.add(new Flight(id, serialNo, arrival, depature, arrivalOffset, departureOffset, fromDestination, toDestination));

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

                int serialNo = res.getInt("serial_number");
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

}
