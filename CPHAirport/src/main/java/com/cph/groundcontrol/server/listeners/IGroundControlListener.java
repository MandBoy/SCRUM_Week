package com.cph.groundcontrol.server.listeners;

public interface IGroundControlListener
{
    /**
     *  Request a specific taxi service group to move an aircraft to specified a lot
     * @param serialNo Aircraft serial number
     * @param lotNo the destination lot
     * @param groupId Taxi service group id
     */
    void onMoveAircraft(String serialNo, int lotNo, int groupId);
}
