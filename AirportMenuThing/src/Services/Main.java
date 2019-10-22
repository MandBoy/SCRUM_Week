package Services;

import java.util.Scanner;

public class Main{
    private boolean go;
    private Scanner scanner;

    public static void main(String [] args){
        boolean go = false;
        Scanner scanner = new Scanner(System.in);
        Program program = new Program(go, scanner);
    }
}
