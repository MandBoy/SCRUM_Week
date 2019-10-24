package com.cph.AirportTestProgramLind.Program;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
       boolean go = false;
       Scanner scanner = new Scanner(System.in);
       MainMenu mainmenu = new MainMenu(scanner, go);
    }
}
