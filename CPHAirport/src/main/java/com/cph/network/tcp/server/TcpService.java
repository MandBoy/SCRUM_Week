package com.cph.network.tcp.server;

import com.cph.network.tcp.shared.IMessageHandler;

public class TcpService
{
    public TcpService() {

    }

    public void listen(IMessageHandler handler) {
        String message = null;

        // get message through socket

        handler.handleMessage(message);
    }
}
