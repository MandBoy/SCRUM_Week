package com.cph.OtherProgram.taxi.server;

import com.cph.OtherProgram.taxi.server.listeners.ITaxiListener;
import com.cph.OtherProgram.taxi.server.repository.ITaxiRepository;

import java.util.ArrayList;

public class TaxiService implements ITaxiService
{
    private ITaxiRepository taxiRepository;
    private int port;
    //private Map<Integer, TcpConnection> clients;
    private ArrayList<ITaxiListener> listeners;

    public void addListener(ITaxiListener listener) {
        listeners.add(listener);
    }
    public void removeListener(ITaxiListener listener) {
        listeners.remove(listener);
    }

    /**
     * Constructor for server-side TaxiService
     * @param port port the service will be listening on
     */
    public TaxiService(int port, ITaxiRepository taxiRepository) {
        this.port = port;
        this.taxiRepository = taxiRepository;
        init();
    }

    private void init() {
        listeners = new ArrayList<ITaxiListener>();
    }

    public void listen() {
        // listen on tcp socket module on specified port

        // message could be that an aircraft was moved
        // onAircraftMoved("AFG32", 6, 1);
    }

    public void stop() {

    }

    public ArrayList<Integer> getAvailableTaxiServiceGroups() {
        ArrayList<Integer> serviceGroupList = null;

        return serviceGroupList;
    }

    public void moveAircraft(String serialNo, int lotNo, int groupId) {
        // TcpConnection client = null;

        // write to db
        taxiRepository.addLotChangeRequest(serialNo, lotNo, groupId);

        // get connection from groupId (saved upon connect)
        // client = clients.get(groupId);

        // push request to taxi client service connection

    }

    /**
     * On aircraft moved message received
     * @param serialNo aircraft serial number
     * @param lotNo destination lot number
     * @param groupId taxi service group id
     */
    private void onAircraftMoved(String serialNo, int lotNo, int groupId) {
        // write to db
        taxiRepository.saveLotChange(serialNo, lotNo, groupId);

        // notify listeners
        for (ITaxiListener listener : listeners) {
            listener.onAircraftMoved(serialNo, lotNo, groupId);
        }
    }
}
