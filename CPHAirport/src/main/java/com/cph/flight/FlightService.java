package com.cph.flight;

import com.cph.flight.shared.AircraftInfo;
import com.cph.flight.shared.FlightInfo;

public class FlightService
{


    public FlightService() {
        init();
    }

    private void init() {
        generateMock();
    }

    private void generateMock() {

    }

    public AircraftInfo getAircraftInfoFromFlightInfo(FlightInfo flightInfo) {
        AircraftInfo aircraftInfo = null;

        // fetch aircraft info from reoisitory
        // aircraftInfo = aircraftInfoRepository.getFromAC(flightInfo.getAc())

        return aircraftInfo;
    }
}
