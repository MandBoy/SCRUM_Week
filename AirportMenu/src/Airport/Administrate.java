package Airport;
import java.util.Scanner;

public class Administrate{
    public Administrate(){}
    public Administrate(Boolean go, Scanner scanner){
        go = true;
        while(go){
            menu();
            switch(scanner.nextInt()){
                case 1:
                    getArrivals();
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
                "--- Airport menu ---\n" +
                "1: Get list of arrivals\n" +
                "9: Exit/Stop\n";
        System.out.println(menu);
    }

    public static void getArrivals(){
        //Need a quary to this get tables.
        System.out.println("...WORK IN PROGRESS...");
    }

}
