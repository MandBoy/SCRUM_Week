package com.cph.serverhub;

import com.cph.groundcontrol.server.IGroundControlService;
import com.cph.groundcontrol.server.listeners.IGroundControlListener;
import com.cph.taxi.server.ITaxiService;
import com.cph.taxi.server.listeners.ITaxiListener;

public class ServerHub implements ITaxiListener, IGroundControlListener
{
    private final IGroundControlService groundControlService;
    private final ITaxiService taxiService;

    public ServerHub(IGroundControlService groundControlSvc, ITaxiService taxiSvc) {
        this.groundControlService = groundControlSvc;
        this.taxiService = taxiSvc;
    }

    public void start() {
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
}
