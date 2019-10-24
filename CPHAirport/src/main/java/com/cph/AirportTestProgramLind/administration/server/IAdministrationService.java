package com.cph.AirportTestProgramLind.administration.server;

import com.cph.AirportTestProgramLind.administration.server.listener.IAdministrationListener;

public interface IAdministrationService {
    void setListener(IAdministrationListener listener);

    void sendFlightInfo();
    void broadcastFlightInfo();
}
