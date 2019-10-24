package com.cph.AirportTestProgramLind.MenuOptions;

import java.util.Scanner;

public class GroundControl{
    public GroundControl(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            switch(scanner.nextInt()){
                case 1:
                    //Begin Debording Procedure. //People off //Baggage off.
                case 2:
                    //Begin Cleaning Procedure. //Clean //Refuel //Baggage on.
                case 3:
                    //Begin Boarding Procedure. //People on.
                case 9:
                    go = false;
                    break;
            }
        }
    }

    public static void menu(){
        String menu =
                "1: Begin Deboarding Procedure \n " +
                "2: Begin Cleaning Procedure \n " +
                "3: Begin Boarding Procedure \n " +
                "9: Exit/Stop \n ";
        System.out.println(menu);
    }
}
