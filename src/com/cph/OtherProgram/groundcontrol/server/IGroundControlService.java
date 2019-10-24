package com.cph.OtherProgram.groundcontrol.server;

import com.cph.OtherProgram.groundcontrol.server.listeners.IGroundControlListener;

public interface IGroundControlService
{
    void addListener(IGroundControlListener listener);
    void removeListener(IGroundControlListener listener);
    void listen();
    void stop();
    void onAircraftMoved(String serialNo, int lotNo, int groupId);
}
