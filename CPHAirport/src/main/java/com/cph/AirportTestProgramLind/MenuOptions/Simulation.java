package com.cph.AirportTestProgramLind.MenuOptions;

import java.util.Scanner;

public class Simulation{
    private int tabel;

    public Simulation(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            getTabels();
            switch(scanner.nextInt()){
                case 1:
                case 2:
                case 3:
                case 4:
                case 9:
                    System.out.println("Going back...");
                    go = false;
                    break;
            }
        }
    }
    public static void menu(){
        String menu =
                "---Simulation Menu--- \n" +
                "1: Create \n" +
                "2: Read \n" +
                "3: Update \n" +
                "4: Delete \n" +
                "5: Run random simulation \n" +
                "9: Go Back\n";
        System.out.println(menu);
    }
    public static void getTabels(){

    }
}
