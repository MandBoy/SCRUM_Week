package com.cph.administration.repository;

import com.cph.models.Station;
import com.cph.models.StationInfo;
import com.cph.persistence.sql.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to see all information on flights
 */

public class AdminRepo {

    public AdminRepo(){}

    private final String SELECT_ALL_STALLS = "SELECT * FROM station";
    private final String SELECT_ALL_STALLS_WITH_FLIGHTS = "SELECT flight.serial_number, station.id "
    + "FROM flight_station JOIN station ON flight_station.fk_station_id = station.id "
    + "JOIN flight ON flight.id = flight_station.fk_flight_id "
    + "WHERE flight_station.reserved_to = null";



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
