package com.cph.groundcontrol.server;

import com.cph.groundcontrol.server.listeners.IGroundControlListener;

public interface IGroundControlService
{
    void addListener(IGroundControlListener listener);
    void removeListener(IGroundControlListener listener);

    void listen();
    void stop();

    void onAircraftMoved(String serialNo, int lotNo, int groupId);
}
