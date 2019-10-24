package com.cph.AirportTestProgramLind.MenuOptions;

import com.cph.administration.repository.AdminRepo;
import com.cph.models.StationInfo;

import java.util.List;
import java.util.Scanner;

public class Administration{

    private AdminRepo repo = new AdminRepo();

    public Administration(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            switch(scanner.nextInt()){
                case 1:
                    //getFlightInfo();
                    break;
                case 2:
                    getStationInfo();
                    break;
                case 3:
                    //getFlightStation();
                    break;
                case 4:
                    //getCrewStatus();
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

    /*
    public void getFlightInfo(){
        //flightInfo = FlightInfo.getInfo();
        for(FlightInfo info : flightInfo){
            System.out.println(info);
        }
    }*/

    public void getStationInfo(){
        List<StationInfo> infoList = repo.seeAllOccupiedStations();

        //stationInfo = StationInfo.getInfo();
        for(StationInfo info : infoList){
            System.out.println(info);
        }

    }

    /*
    public void getFlightStation(){


        //flightStation = FlightStation.getInfo();
        for(FlightStation info : flightStation){
            System.out.println(info);
        }
    }
    public void getCrewStatus(){
        //crewStatus = CrewStatus.getInfo();
        for(CrewStatus info : crewStatus){
            System.out.println(info);
        }
    }*/
}
