package com.cph.AirportTestProgram.MenuOptions;

import com.cph.AirportTestProgram.administration.repository.AdminRepo;
import com.cph.AirportTestProgram.models.Flight;
import com.cph.AirportTestProgram.models.StationInfo;

import java.util.List;
import java.util.Scanner;

public class Administration{
    private AdminRepo repo = new AdminRepo();

    public Administration(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            System.out.print("Your Pick: ");
            switch(scanner.nextInt()){
                case 1:
                    getFlightInfo();
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
                case 5 :
                    System.out.println("Please select flight: ");
                    String flightNo = scanner.next();
                    System.out.println("Write number of minutes delayed: ");
                    int delayed = scanner.nextInt();
                    repo.changeDeparture(delayed, flightNo);
                    System.out.println("Offset changed for flight " + flightNo + " to " + delayed + " minutes");
                    break;
                case 9:
                    System.out.println("Going back...");
                    go = false;
                    break;
            }
        }
    }
    public static void menu(){
        String menu =
                "---Administration Menu--- \n" +
                "1: Get FlightInfo \n" +
                "2: Get StationInfo \n" +
                "3: Get Flight Station \n" +
                "4: Get Crew status \n" +
                "5: Set delay on a flight in minutes \n" +
                "9: Exit/Stop\n";
        System.out.println(menu);
    }

    public void getFlightInfo(){
        List<Flight> flights = repo.seeAllFlightInfo();
        if (flights.size() > 0) {
            for (Flight info : flights) {
                System.out.println(info + "\n");
            }
        } else {
            System.out.println("No flight info to show.");
        }
    }
    public void getStationInfo(){
        List<StationInfo> infoList = repo.seeAllOccupiedStations();
        if (infoList.size() > 0) {
            for (StationInfo info : infoList) {
                System.out.println(info);
            }
        } else {
            System.out.println("No station info to show.");
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
