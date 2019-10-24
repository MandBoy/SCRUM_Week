package com.cph.flight.shared;

import java.util.Date;

public class FlightInfo
{
    enum FlightState
    {
        ARRIVAL("A"),
        DEPARTURE("D");

        public final String label;

        FlightState(String label) {
            this.label = label;
        }
    }

    private Date expectedTime;
    private FlightState flightState;
    private String aircraftCarrier;
    private String origin;
    private String destination;

    public Date getExpectedTime() {
        return expectedTime;
    }

    public void setExpectedTime(Date expectedTime) {
        this.expectedTime = expectedTime;
    }

    public FlightState getFlightState() {
        return flightState;
    }

    public void setFlightState(FlightState flightState) {
        this.flightState = flightState;
    }

    public String getAircraftCarrier() {
        return aircraftCarrier;
    }

    public void setAircraftCarrier(String aircraftCarrier) {
        this.aircraftCarrier = aircraftCarrier;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public FlightInfo(Date expectedTime, FlightState flightState, String aircraftCarrier, String origin, String destination) {
        this.expectedTime = expectedTime;
        this.flightState = flightState;
        this.aircraftCarrier = aircraftCarrier;
        this.origin = origin;
        this.destination = destination;
    }






}
