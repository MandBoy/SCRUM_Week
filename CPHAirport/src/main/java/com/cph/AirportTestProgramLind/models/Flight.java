package com.cph.AirportTestProgramLind.models;

import java.time.LocalDateTime;

public class Flight {

    private int id;
    private String serialNo;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private int arrivalOffset;
    private int departureOffset;
    private String fromDestination;
    private String toDestination;
    private int planeSize;

    public Flight(){}

    public Flight(int id, String serialNo, LocalDateTime arrivalTime, LocalDateTime departureTime, int arrivalOffset, int departureOffset, String fromDestination, String toDestination, int planeSize) {
        this.id = id;
        this.serialNo = serialNo;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.arrivalOffset = arrivalOffset;
        this.departureOffset = departureOffset;
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
        this.planeSize = planeSize;
    }

    public int getPlaneSize() {
        return planeSize;
    }

    public void setPlaneSize(int planeSize) {
        this.planeSize = planeSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getArrivalOffset() {
        return arrivalOffset;
    }

    public void setArrivalOffset(int arrivalOffset) {
        this.arrivalOffset = arrivalOffset;
    }

    public int getDepartureOffset() {
        return departureOffset;
    }

    public void setDepartureOffset(int departureOffset) {
        this.departureOffset = departureOffset;
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public void setFromDestination(String fromDestination) {
        this.fromDestination = fromDestination;
    }

    public String getToDestination() {
        return toDestination;
    }

    public void setToDestination(String toDestination) {
        this.toDestination = toDestination;
    }

    public boolean equals(Flight flight)
    {
        if(this.id == flight.id)
        {
            return true;
        }

        return false;
    }

    public String toString()
    {
        LocalDateTime expectedArrival = getArrivalTime().plusMinutes(getArrivalOffset());
        LocalDateTime expectedDeparture = getDepartureTime().plusMinutes(getArrivalOffset() + getDepartureOffset());

        String flightInfo = "Flight number: " + getSerialNo() +"\n"
                + "Arrival time: " + getArrivalTime() + "\n"
                + "Expected arrival time: " + expectedArrival + "\n"
                + "Departure time: " + getDepartureTime() + "\n"
                + "Expected departure time: " + expectedDeparture + "\n"
                + "From destination: " + getFromDestination() + "\n"
                + "To destination: " + getToDestination() + "\n"
                + "Size of flight: " + getPlaneSize();

        return flightInfo;
    }
}
