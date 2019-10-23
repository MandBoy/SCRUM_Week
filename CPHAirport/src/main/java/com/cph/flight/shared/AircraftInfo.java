package com.cph.flight.shared;

public class AircraftInfo
{
    public enum AircraftSize
    {
        S,
        M,
        L;
    }

    private String ac;
    private AircraftSize aircraftSize;

    public AircraftSize getAircraftSize() {
        return aircraftSize;
    }

    public void setAircraftSize(AircraftSize aircraftSize) {
        this.aircraftSize = aircraftSize;
    }


    public AircraftInfo(String ac, AircraftSize aircraftSize) {
        this.ac = ac;
        this.aircraftSize = aircraftSize;
    }
}
