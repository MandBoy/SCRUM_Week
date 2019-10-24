package com.cph.models;

public class Station {

    private int ID;
    private boolean isActive;
    private int type;


    public Station(){}

    public Station(int ID, boolean isActive, int type) {
        this.ID = ID;
        this.isActive = isActive;
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
