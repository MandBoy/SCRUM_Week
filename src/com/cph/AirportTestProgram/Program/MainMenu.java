package com.cph.AirportTestProgram.Program;
import com.cph.AirportTestProgram.MenuOptions.Administration;
import com.cph.AirportTestProgram.MenuOptions.GroundControl;
import com.cph.AirportTestProgram.MenuOptions.Simulation;

import java.util.Scanner;

public class MainMenu{
    private Administration administration;
    private GroundControl groundControl;
    private Simulation simulation;

    public MainMenu(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            System.out.print("Your pick: ");
            switch(scanner.nextInt()){
                case 1:
                    administration = new Administration(scanner, go);
                    break;
                case 2:
                    groundControl = new GroundControl(scanner, go);
                    break;
                case 3:
                    simulation = new Simulation(scanner, go);
                    break;
                case 9:
                    go = false;
                    break;
            }
        }
    }

    public static void menu(){
        String menu =
                "---Main Menu---\n" +
                "1: Administration \n" +
                "2: Ground control \n" +
                "3: Simulation \n" +
                "9: Exit/Stop \n" ;
        System.out.println(menu);
    }
}
