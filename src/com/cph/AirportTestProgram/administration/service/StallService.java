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

        List<Station> allStations = repo.seeAllStations();

        List<Integer> occupiedIds = new ArrayList<>();
        for (StationInfo info : repo.seeAllOccupiedStations()) {
            occupiedIds.add(info.getId());
        }

        Station assignedStall = null;
        for (Station station : allStations) {
            if (!occupiedIds.contains(station.getID()) && station.getType() == planeSize) {
                assignedStall = station;
            }
        }

        return assignedStall;
    }
}
