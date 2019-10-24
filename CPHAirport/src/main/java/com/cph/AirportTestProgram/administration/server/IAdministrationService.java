package com.cph.AirportTestProgram.administration.server;

import com.cph.AirportTestProgram.administration.server.listener.IAdministrationListener;

public interface IAdministrationService {
    void setListener(IAdministrationListener listener);

    void sendFlightInfo();
    void broadcastFlightInfo();
}
