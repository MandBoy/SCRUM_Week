package com.cph.AirportTestProgramLind.MenuOptions;

import com.cph.AirportTestProgramLind.CRUD.Create;
import com.cph.AirportTestProgramLind.CRUD.Delete;
import com.cph.AirportTestProgramLind.CRUD.Read;
import com.cph.AirportTestProgramLind.CRUD.Update;

import java.util.Scanner;

public class Simulation{
    private Create create;
    private Read read;
    private Update update;
    private Delete delete;
    private int tabel;

    public Simulation(Scanner scanner, boolean go){
        go = true;
        while(go){
            menu();
            getTabels();
            switch(scanner.nextInt()){
                case 1:
                    create = new Create();
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
                "9: Exit/stop \n ";
        System.out.println(menu);
    }
    public static void getTabels(){}
}
