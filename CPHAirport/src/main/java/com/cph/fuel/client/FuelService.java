package com.cph.fuel.client;

import java.io.DataOutputStream;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FuelService {

  //  DataOutputStream out = new DataOutputStream();



    public FuelService()
    {

    }


    //her siger vi at vi allerede ved at det er en TANK-kode
    public void receiveFuelRequest(String message) { //flightNo size stall

        StringTokenizer st = new StringTokenizer(message, " ");
        String flightNo = st.nextToken();
        String size = st.nextToken();
        String stall = st.nextToken();

        System.out.println("Fill up " + flightNo + " with fuel");
        System.out.println("Answer OK to accept or NO to decline task");
        Scanner console = new Scanner(System.in);
        String text = "";


        while (!text.equals("OK") || !text.equals("NO")) {

            text = console.next();

            if (text.equals("OK")) {
                sendOK(flightNo);
                fillUpWithFuel(size, stall, flightNo);
            } else if (text.equals("NO")) {
                sendNO(flightNo);
            } else {
                System.out.println("Please answer OK to accept or NO to decline task");
            }

        }

    }

    public void sendNO(String flightNo)
    {
        String message = "T_NO " + flightNo;
        //out.writeUTF(message);
    }

    public void sendOK(String flightNo){

        String message = "T_OK " + flightNo;
        //out.writeUTF(message);
    }

    //stall skal bruges hvis vi regner transporttid ud
    public void fillUpWithFuel(String size, String stall, String flightNo){

        size = size.toLowerCase();
        System.out.println("Filling tank " + flightNo);
        LocalDateTime time = LocalDateTime.now();

        switch (size) {
            case "small":

                fillingNow(10);
                break;

            case "medium" :

               fillingNow(20);
                break;

            case "large" :

                fillingNow(30);
                break;


                default:
                    System.out.println("Unvalid size");
                    break;

        }

        System.out.println("Tank filled!");
        notifyOfFullTank(flightNo);

    }

    private void fillingNow(int size)
    {
        for(int i = size; i == 0; i--)
        {
            System.out.println("Time until full: " + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }

        }

    }

    public void notifyOfFullTank(String flightNo)
    {
        String message = "TDON " + flightNo;
        //out.writeUTF(message);
    }




}
