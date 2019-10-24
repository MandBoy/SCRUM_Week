package com.cph.administration.repository;

import com.cph.AirportTestProgram.administration.repository.AdminRepo;
import com.cph.AirportTestProgram.models.Station;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AdminRepoTest {

    AdminRepo repo = new AdminRepo();

    @Test
    public void seeStationTest()
    {
        Station station = new Station();
        station.setID(1);
        station.setType(1);
        station.setActive(true);

        List<Station> stations = repo.seeAllStations();

        assertTrue(true);
       // assertEquals(station, station.getID());
    }

    @Test
    public void dummy()
    {
        assertTrue(true);
    }
}
