package Project2;

import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(6000);
            System.out.println("Server started... Waiting for client");

            Socket socket = server.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;

            while (true) {

                if ((msg = input.readLine()) != null) {
                    System.out.println("Client: " + msg);
                }

                // Send to client
                String reply = keyboard.readLine();
                output.println(reply);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}