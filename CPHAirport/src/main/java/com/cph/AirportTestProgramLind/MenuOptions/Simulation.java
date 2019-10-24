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
            }
        }
    }
    public static void menu(){
        String menu =
                "1: Create \n " +
                "2: Read \n " +
                "3: Update \n " +
                "4: Delete \n " +
                "5: Run random simulation \n" +
                "9: Exit/stop \n ";
        System.out.println(menu);
    }
    public static void getTabels(){

    }
}
