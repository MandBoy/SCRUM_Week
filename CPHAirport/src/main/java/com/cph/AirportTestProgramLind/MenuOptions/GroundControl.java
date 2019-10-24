package com.cph.AirportTestProgramLind.MenuOptions;

import java.util.Scanner;

public class GroundControl{
    public GroundControl(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            System.out.print("Your Pick: ");
            switch(scanner.nextInt()){
                case 1:
                    //Taxi Arrival.
                    taxiArrival();
                    break;
                case 2:
                    //Begin Debording Procedure. //People off //Baggage off.
                    deboardPeople();
                    deboardBaggage();
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
                    movePlain();
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
    public void taxiArrival(){
        System.out.println("Plane taxing to stall begun...");
        try {
            Thread.sleep(10000);
            System.out.println("Plane Taxing: DONE! \n");
        }
        catch(InterruptedException e) {
            System.out.println("Plane Taxing: FAILED \n");
        }
    }

    public void deboardPeople(){
        System.out.println("Plane deboarding people begun...");
            try {
                Thread.sleep(10000);
                System.out.println("People deboarding: DONE! \n");
            }
            catch(InterruptedException e) {
                System.out.println("People debaording: FAILED \n");
            }
    }
    public void deboardBaggage() {
        System.out.println("Plane deboarding baggage begun...");
        try{
            Thread.sleep(15000);
            System.out.println("Baggage deboarding: DONE! \n");
        } catch (InterruptedException e) {
            System.out.println("Baggage deboarding: FAILED! \n");
        }
    }
    public void cleanPlane(){
        System.out.println("Plane cleaning begun...");
        try{
            Thread.sleep(40000);
            System.out.println("Plane Cleaning: DONE! \n");
        } catch (InterruptedException e) {
            System.out.println("Plane Cleaning: FAILED! \n");
        }
    }
    private void refuelPlane(){
        System.out.println("Plane refueling begun...");
        try{
            Thread.sleep(20000);
            System.out.println("Plane Refueling: DONE \n");
        } catch (InterruptedException e) {
            System.out.println("Plane Refueling: FAILED\n");
        }
    }
    private void baggageOn(){
        System.out.println("Plane baggaging begun...");
        try{
            Thread.sleep(25000);
            System.out.println("Plane Baggaging: DONE! \n");
        } catch (InterruptedException e) {
            System.out.println("Plane Baggaging: FAILED \n");
        }
    }
    private void boardPeople(){
        System.out.println("Plane boarding begun...");
        try{
            Thread.sleep(20000);
            System.out.println("Plane boarding: DONE! \n");
        } catch (InterruptedException e) {
            System.out.println("Plane boarding: FAILED!\n");
        }
    }
    private void taxiDeparting(){
        System.out.println("Plane Taxi to departing begun...");
        try{
            Thread.sleep(20000);
            System.out.println("Plane Taxing: DONE! \n");
        } catch (InterruptedException e) {
            System.out.println("Plane Taxing: FAILED!\n");
        }
    }
    private void movePlain(){
        System.out.println("Moving plane...");
        try{
            Thread.sleep(20000);
            System.out.println("Moving plane: DONE! \n");
        } catch (InterruptedException e) {
            System.out.println("Moving plane: FAILED!\n");
        }
    }




}
