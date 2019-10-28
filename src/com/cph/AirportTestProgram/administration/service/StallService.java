package com.cph.AirportTestProgram.administration.service;

import com.cph.AirportTestProgram.administration.repository.AdminRepo;
import com.cph.AirportTestProgram.models.Station;
import com.cph.AirportTestProgram.models.StationInfo;

import java.util.ArrayList;
import java.util.List;

public class StallService {

    private AdminRepo repo;

    public StallService() {
        repo = new AdminRepo();
    }

    public Station findAvailableStall(int planeSize) {

        //fetch a list of all stations
        List<Station> allStations = repo.seeAllStations();

        //create a list of all stations id that are occupied
        List<Integer> occupiedIds = new ArrayList<>();
        for (StationInfo info : repo.seeAllOccupiedStations()) {
            occupiedIds.add(info.getId());
        }

        //make null stall to return
        Station assignedStall = null;
        for (Station station : allStations) {
            //if a still is not occupied, and that station size fits the plane size, assign the stall
            if (!occupiedIds.contains(station.getID()) && station.getType() == planeSize) {
                assignedStall = station;
            }
        }

        return assignedStall;
    }
}
