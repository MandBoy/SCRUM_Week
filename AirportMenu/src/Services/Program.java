package Services;
import Airport.*;
import Simulator.*;

import java.util.Scanner;

//Main Program that user uses.
//Options are opened and when option is picked connection is made to server which handles database.
public class Program{
    private Administrate administrate;
    private Simulator simulate;

    public Program(){}
    public Program(boolean go, Scanner scanner){
        go = true;
        while(go){
            menu();
            switch(scanner.nextInt()){
                case 1:
                    administrate = new Administrate(go, scanner);
                    break;
                case 4:
                    simulate = new Simulator();
                    break;
                case 9:
                    System.out.println("Closing program...");
                    go = false;
                    break;
            }
        }
    }
    public static void menu(){
        String menu =
                "---Option Page--- \n" +
                "1: Administrate airport \n" +
                "2: --- TO BE DECIDED --- \n" +
                "3: --- TO BE DECIDED --- \n" +
                "4: Simulator \n" +
                "9: Exit/Quit \n";
        System.out.println(menu);
    }

}
