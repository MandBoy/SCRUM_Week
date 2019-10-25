package com.cph.AirportTestProgram.MenuOptions;

import com.cph.AirportTestProgram.administration.repository.AdminRepo;
import com.cph.AirportTestProgram.models.Plane;
import java.util.Scanner;

public class GroundControl{
    private int timeToAction;
    private AdminRepo adminRepo = new AdminRepo();
    private Plane plane;

    public GroundControl(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            System.out.print("Your Pick: ");
            switch(scanner.nextInt()){
                case 1:
                    //Taxi Arrival.
                    plane = planeToWorkOn();
                    waitingStall();
                    assignStall();
                    taxiArrival(plane);
                    break;
                case 2:
                    //Begin Debording Procedure. //People off //Baggage off.
                    deboardPeople(plane);
                    deboardBaggage(plane);
                    break;
                case 3:
                    //Begin Cleaning Procedure. //Clean //Refuel //Baggage on.
                    cleanPlane();
                    refuelPlane();
                    baggageOn();
                    break;
                case 4:
                    //Begin Boarding Procedure. //People on.
                    boardPeople();
                    break;
                case 5:
                    //Taxi Departing.
                    taxiDeparting();
                    break;
                case 6:
                    //Move a plain.
                    movePlane();
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
                "---Ground Control Menu--- \n" +
                "1: Being Taxi arrival \n" +
                "2: Begin Deboarding Procedure \n" +
                "3: Begin Cleaning Procedure \n" +
                "4: Begin Boarding Procedure \n" +
                "5: Begin Taxi departing \n" +
                "6: Move Plane \n" +
                "9: Exit/Stop \n";
        System.out.println(menu);
    }
    public Plane planeToWorkOn(){
        Plane plane = new Plane();
        return plane;
    }
    public void waitingStall(){}
    public void assignStall(){}
    public void taxiArrival(Plane plane){
        System.out.println("Plane: " + plane.getPlaneNumber() + " taxing to stall: " + plane.getStallNumber() + " begun...");
        switch(plane.getPlaneSize()){
            case 1:
                timeToAction = 12000;
                break;
            case 2:
                timeToAction = 10000;
                break;
            case 3:
                timeToAction = 15000;
                break;
        }
        try{
                System.out.println("This will take: " + timeToAction + " seconds.");
                Thread.sleep(timeToAction);
                System.out.println("Plane Taxing: "+ plane.getPlaneNumber() + " to: " + plane.getStallNumber() + " DONE!\n");
            }
            catch(InterruptedException e) {
                System.out.println("Plane Taxing: "+ plane.Number + " FAILED!\n");
            }
    }
    public void deboardPeople(Plane plane){
        System.out.println("Plane: " + this.planeNumber + " deboarding people begun...");
            switch(this.planeSize){
                case 1:
                    timeToAction = 5000;
                case 2:
                    timeToAction = 10000;
                case 3:
                    timeToAction = 15000;
            }
            try{
                System.out.println("This will take: " + timeToAction + " seconds.");
                Thread.sleep(timeToAction);
                System.out.println("People deboarding: " + planeNumber + " DONE!\n");
            }
            catch(InterruptedException e) {
                System.out.println("People debaording: " + planeNumber + " FAILED!\n");
            }
    }
    public void deboardBaggage(int planeNumber, int planeSize){
        System.out.println("Plane: " + planeNumber + " deboarding baggage begun...");
        switch(planeSize){
            case 1:
                timeToAction = 10000;
            case 2:
                timeToAction = 15000;
            case 3:
                timeToAction = 20000;
        }
        try{
            System.out.println("This will take: " + timeToAction + " seconds.");
            Thread.sleep(timeToAction);
            System.out.println("Baggage deboarding on plane: " + planeNumber + " DONE!\n");
        } catch (InterruptedException e) {
            System.out.println("Baggage deboarding on plane: " +planeNumber + " FAILED!\n");
        }
    }
    public void cleanPlane(int planeNumber, int planeSize){
        System.out.println("Plane: " + planeNumber + " cleaning begun...");
        switch(planeSize){
            case 1:
                timeToAction = 30000;
                break;
            case 2:
                timeToAction = 40000;
                break;
            case 3:
                timeToAction = 60000;
                break;
        }
        try{
            System.out.println("This will take: " + timeToAction + "Seconds.");
            Thread.sleep(timeToAction);
            System.out.println("Plane Cleaning on plane: " + planeNumber + " DONE!\n");
        } catch (InterruptedException e) {
            System.out.println("Plane Cleaning on plane: " + planeNumber + " FAILED!\n");
        }
    }
    public void refuelPlane(int planeNumber, int planeSize){
        System.out.println("Plane refueling begun...");
        switch(planeSize){
            case 1:
                timeToAction = 10000;
                break;
            case 2:
                timeToAction = 20000;
                break;
            case 3:
                timeToAction = 30000;
                break;
        }
        try{
            System.out.println("This will take: " + timeToAction + " seconds.");
            Thread.sleep(timeToAction);
            System.out.println("Plane Refueling on plane: " + planeNumber + " DONE!\n");
        } catch (InterruptedException e) {
            System.out.println("Plane Refueling on plane: " + planeNumber + " FAILED!\n");
        }
    }
    public void baggageOn(int planeNumber, int planeSize){
        System.out.println("Plane " + planeNumber + " baggaging begun...");
        switch(planeSize){
            case 1:
                timeToAction = 15000;
                break;
            case 2:
                timeToAction = 25000;
                break;
            case 3:
                timeToAction = 35000;
                break;
        }
        try{
            System.out.println("This will take: " + timeToAction + " seconds.");
            Thread.sleep(timeToAction);
            System.out.println("Plane Baggaging on plane: " + planeNumber + " DONE!\n");
        } catch (InterruptedException e) {
            System.out.println("Plane Baggaging on plane: " + planeNumber + " FAILED!\n");
        }
    }
    public void boardPeople(int planeNumber, int planeSize){
        System.out.println("Plane boarding begun...");
        switch(planeSize){
            case 1:
                timeToAction = 15000;
                break;
            case 2:
                timeToAction = 20000;
                break;
            case 3:
                timeToAction = 35000;
                break;
        }
        try{
            System.out.println("This will take: " + timeToAction + " seconds.");
            Thread.sleep(timeToAction);
            System.out.println("Plane: " + planeNumber + " boarding: DONE! \n");
        } catch (InterruptedException e) {
            System.out.println("Plane: " + planeNumber + " boarding: FAILED!\n");
        }
    }
    public void taxiDeparting(int planeNumber, int planeSize){
        System.out.println("Plane " + planeNumber + " Taxing to departing begun...");
        switch(planeSize){
            case 1:
                timeToAction = 10000;
                break;
            case 2:
                timeToAction = 10000;
                break;
            case 3:
                timeToAction = 10000;
                break;
        }
        try{
            System.out.println("This will take: " + timeToAction + " seconds.");
            Thread.sleep(timeToAction);
            System.out.println("Plane: " + planeNumber + " Taxing: DONE! \n");
        } catch (InterruptedException e) {
            System.out.println("Plane: " + planeNumber + " Taxing: FAILED!\n");
        }
    }
    public void movePlane(int planeNumber, int fromStall, int toStall, int planeSize){
        System.out.println("Moving plane: " + planeNumber + " from: " + fromStall + " to: " + toStall);
        switch(planeSize){
            case 1:
                timeToAction = 8000;
                break;
            case 2:
                timeToAction = 5000;
                break;
            case 3:
                timeToAction = 5000;
                break;
        }
        try{
            System.out.println("This will take: " + timeToAction + " seconds.");
            Thread.sleep(timeToAction);
            System.out.println("Plane: " + planeNumber + " Moving: DONE!\n");
        } catch (InterruptedException e) {
            System.out.println("Plane: " + planeNumber + " Moving: FAILED!\n");
        }
    }





}
