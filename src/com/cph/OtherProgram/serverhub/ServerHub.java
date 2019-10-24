package com.cph.OtherProgram.serverhub;

import com.cph.AirportTestProgram.administration.server.IAdministrationService;
import com.cph.AirportTestProgram.administration.server.listener.IAdministrationListener;
import com.cph.OtherProgram.groundcontrol.server.IGroundControlService;
import com.cph.OtherProgram.groundcontrol.server.listeners.IGroundControlListener;
import com.cph.OtherProgram.taxi.server.ITaxiService;
import com.cph.OtherProgram.taxi.server.listeners.ITaxiListener;

import java.util.ArrayList;

public class ServerHub implements IAdministrationListener, ITaxiListener, IGroundControlListener
{
    private final IAdministrationService administrationService;
    private final IGroundControlService groundControlService;
    private final ITaxiService taxiService;

    public ServerHub(IAdministrationService administrationSvc, IGroundControlService groundControlSvc, ITaxiService taxiSvc) {
        this.administrationService = administrationSvc;
        this.groundControlService = groundControlSvc;
        this.taxiService = taxiSvc;
    }

    public void start() {
        administrationService.setListener(this);
        groundControlService.addListener(this);
        taxiService.addListener(this);

        groundControlService.listen();
        taxiService.listen();
    }

    public void stop() {
        groundControlService.stop();
        taxiService.stop();

        groundControlService.removeListener(this);
        taxiService.removeListener(this);
    }

    public void onMoveAircraft(String serialNo, int lotNo, int groupId) {
        // push aircraft move request to taxi service
        taxiService.moveAircraft(serialNo, lotNo, groupId);
    }

    public void onAircraftMoved(String serialNo, int lotNo, int groupId) {

        // push aircraft moved message to ground control service
        groundControlService.onAircraftMoved(serialNo, lotNo, groupId);
    }

    public ArrayList<String> onAdministrationRequestFlightInfo() {
        // get FlightInfo
        return new ArrayList<String>();
    }
}
