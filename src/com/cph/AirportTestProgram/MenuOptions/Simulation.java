package com.cph.AirportTestProgram.MenuOptions;

import java.util.Scanner;

public class Simulation{
    private int tabel;

    public Simulation(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            getTabels();
            System.out.print("Your Pick: ");
            switch(scanner.nextInt()){
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    generateSimulation();
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
                "---Simulation Menu--- \n" +
                "1: Create \n" +
                "2: Read \n" +
                "3: Update \n" +
                "4: Delete \n" +
                "5: Run random simulation \n" +
                "9: Exit/stop\n";
        System.out.println(menu);
    }
    public static void getTabels(){}
    public static void create(){}
    public static void read(){}
    public static void update(){}
    public static void delete(){}
    public static void generateSimulation(){}
}
