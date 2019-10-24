package com.cph.AirportTestProgramLind.models;

public class StationInfo {

    private int id;
    private String serial_number;

    public StationInfo(int id, String serial_number) {
        this.id = id;
        this.serial_number = serial_number;
    }

    public StationInfo(){}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSerial_number() {
        return serial_number;
    }
    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }
    public String toString()
    {
        String info = "Stall number " + getId() + "is occupied by " + getSerial_number();
        return info;
    }
}
