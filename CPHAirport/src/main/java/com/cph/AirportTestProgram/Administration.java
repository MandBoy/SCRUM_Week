package com.cph.AirportTestProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Administration{
    private ArrayList<FlightInfo> flightInfo = new ArrayList<FlightInfo>();
    private ArrayList<StationInfo> stationInfo = new ArrayList<StationInfo>();
    private ArrayList<FlightStation> flightStation = new ArrayList<FlightStation>();
    private ArrayList<CrewStatus> crewStatus = new ArrayList<CrewStatus>();


    public Administration(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            switch(scanner.nextInt()){
                case 1:
                    getFlightInfo(flightInfo);
                    break;
                case 2:
                    getStationInfo(stationInfo);
                    break;
                case 3:
                    getFlightStation(flightStation);
                    break;
                case 4:
                    getCrewStatus(crewStatus);
                    break;
                case 9:
                    go = false;
                    break;
            }
        }
    }
    public static void menu(){
        String menu =
                "1: Get FlightInfo\n" +
                "2: Get StationInfo\n" +
                "3: Get Flight Station\n " +
                "4: Get Crew status \n" +
                "9: Exit/Stop \n";
        System.out.println(menu);
    }

    public static void getFlightInfo(ArrayList<FlightInfo> flightInfo){
        //flightInfo = FlightInfo.getInfo();
        for(FlightInfo info : flightInfo){
            System.out.println(info);
        }
    }
    public static void getStationInfo(ArrayList<StationInfo> stationInfo){
        //stationInfo = StationInfo.getInfo();
        for(StationInfo info : stationInfo){
            System.out.println(info);
        }

    }
    public static void getFlightStation(ArrayList<FlightStation> flightStation){
        //flightStation = FlightStation.getInfo();
        for(FlightStation info : flightStation){
            System.out.println(info);
        }
    }
    public static void getCrewStatus(ArrayList<CrewStatus> crewStatus){
        //crewStatus = CrewStatus.getInfo();
        for(CrewStatus info : crewStatus){
            System.out.println(info);
        }
    }
}
