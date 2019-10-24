package com.cph.administration.repository;

import com.cph.models.Station;
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
    private final String SELECT_ALL_STALLS_WITH_FLIGHTS = "SELECT * FROM station " +
            "JOIN flight_ station WHERE ";




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
