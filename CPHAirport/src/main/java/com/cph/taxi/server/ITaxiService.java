package com.cph.taxi.server;

import com.cph.taxi.server.listeners.ITaxiListener;

import java.util.ArrayList;

public interface ITaxiService
{
    void addListener(ITaxiListener listener);
    void removeListener(ITaxiListener listener);

    void listen();
    void stop();

    /**
     * Request a specific taxi service group to move an aircraft to specified a lot
     * @param serialNo Aircraft serial number
     * @param lotNo the destination lot
     * @param groupId Taxi service group id
     */
    void moveAircraft(String serialNo, int lotNo, int groupId);
}
