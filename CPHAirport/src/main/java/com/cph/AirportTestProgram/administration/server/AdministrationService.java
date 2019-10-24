package com.cph.AirportTestProgram.administration.server;

import com.cph.AirportTestProgram.administration.server.listener.IAdministrationListener;

import java.util.ArrayList;

public class AdministrationService implements IAdministrationService
{
    private IAdministrationListener listener;

    public void setListener(IAdministrationListener listener) {
        listener = listener;
    }

    protected void onConnect(/* connection info */) {
        ArrayList<String> flightInfo = onFlightInfoRequest();
        sendFlightInfo(/* connection & flightInfo */);
    }

    protected ArrayList<String> onFlightInfoRequest() {
            return listener.onAdministrationRequestFlightInfo();
    }

    public void sendFlightInfo(/* client, flightInfo */ ) {
        // get connection to client
        // push flight info
    }

    public void broadcastFlightInfo() {
        // push new flight to all clients
    }
}
