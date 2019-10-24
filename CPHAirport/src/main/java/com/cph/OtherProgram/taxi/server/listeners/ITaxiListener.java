package com.cph.OtherProgram.taxi.server.listeners;

public interface ITaxiListener
{
    void onAircraftMoved(String serialNo, int lotNo, int groupId);
}
