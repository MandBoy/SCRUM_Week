package com.cph.OtherProgram.app.server;

import com.cph.OtherProgram.groundcontrol.server.GroundControlService;
import com.cph.repository.TaxiRepository;
import com.cph.OtherProgram.taxi.server.TaxiService;
import com.cph.OtherProgram.serverhub.ServerHub;

public class ServerApp
{
    private ServerHub serverHub;

    public static void main(String[] args) {
        TaxiRepository taxiRepository = null;
        GroundControlService groundControlSvc = null;
        TaxiService taxiSvc = null;

        taxiRepository = new TaxiRepository();

        groundControlSvc = new GroundControlService(1337);
        taxiSvc = new TaxiService(1338, taxiRepository);

       //ServerHub serverHub = new ServerHub(groundControlSvc, taxiSvc);
       //new ServerApp(serverHub);
    }

    private ServerApp(ServerHub serverHub) {
        this.serverHub = serverHub;
    }

    protected void start() {
        serverHub.start();
    }

    protected void stop() {
        serverHub.stop();
    }
}
