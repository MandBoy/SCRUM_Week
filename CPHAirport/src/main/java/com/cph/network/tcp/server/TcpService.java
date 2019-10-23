package com.cph.network.tcp.client;

import com.cph.network.tcp.shared.IMessageHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class TcpService
{
    private String host;
    private int port;

    private volatile boolean listening;

    private IMessageHandler handler;
    private Socket listener;
    private BufferedReader bufferedReader;

    public TcpService(String host, int port) {
        this.host = host;
        this.port = port;

        try {
            listen(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listen(IMessageHandler handler) throws IOException {
        if (listening) {
            return;
        }

        listener = new Socket(host, port);
        listener.setSoTimeout(5000);
        listening = true;

        bufferedReader = new BufferedReader(new InputStreamReader(listener.getInputStream()));

        String message = null;

        try {
            while (listening) {
                if ((message = bufferedReader.readLine()) != null) {
                    handler.handleMessage(message);
                }
            }
        } catch (SocketTimeoutException e) {
            //empty
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        listening = false;
    }
}
