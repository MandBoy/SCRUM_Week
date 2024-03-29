package com.cph.OtherProgram.taxi.server;

import com.cph.OtherProgram.taxi.server.listeners.ITaxiListener;

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
