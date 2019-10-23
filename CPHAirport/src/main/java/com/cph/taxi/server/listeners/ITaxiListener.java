package com.cph.taxi.server.listeners;

public interface ITaxiListener
{
    void onAircraftMoved(String serialNo, int lotNo, int groupId);
}
