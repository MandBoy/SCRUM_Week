package com.cph.models;

public class StationInfo {

    private int id;
    private int serial_number;

    public StationInfo(int id, int serial_number) {
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

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }
}
