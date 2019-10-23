package com.cph.taxi.server.repository;

public interface ITaxiRepository
{
    void addLotChangeRequest(String aircraftSerialNo, int lotNo, int groupId);
    void saveLotChange(String aircraftSerialNo, int lotNo, int groupId);
}
