package com.cph.administration.server;

import com.cph.administration.server.listener.IAdministrationListener;

public interface IAdministrationService {
    void setListener(IAdministrationListener listener);

    void sendFlightInfo();
    void broadcastFlightInfo();
}
