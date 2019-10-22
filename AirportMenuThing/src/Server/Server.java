package Server;

import java.net.ServerSocket;

public class Server{
    ServerSocket serverSocket;

    public Server(){
        try {
            serverSocket = new ServerSocket();
        } catch (Exception e) {
            System.out.println("Problem occurred");
        }
    }
}


