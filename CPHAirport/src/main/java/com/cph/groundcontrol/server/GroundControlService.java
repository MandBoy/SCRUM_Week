package com.cph.groundcontrol.server;

import com.cph.groundcontrol.server.listeners.IGroundControlListener;

import java.util.ArrayList;

public class GroundControlService implements IGroundControlService
{
    private ArrayList<IGroundControlListener> listeners;

    public void addListener(IGroundControlListener listener) {
        listeners.add(listener);
    }

    public void removeListener(IGroundControlListener listener) {
        listeners.remove(listener);
    }

    public GroundControlService(int port) {}

    public void listen() {
        // use listen on socket using tcp module

    }

    public void stop() {
        // stop listening on socket using tcp module
    }

    public void onMoveAircraft(String serialNo, int lotNo, int groupId) {
        for (IGroundControlListener listener : listeners) {
            listener.onMoveAircraft(serialNo, lotNo, groupId);
        }
    }

    public void onAircraftMoved(String serialNo, int lotNo, int groupId) {

    }
}
