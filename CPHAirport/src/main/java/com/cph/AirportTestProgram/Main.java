package com.cph.AirportTestProgram;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
       boolean go = false;
       Scanner scanner = new Scanner(System.in);
       Airport airport = new Airport(scanner, go);
    }
}
