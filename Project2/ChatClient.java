package Project2;

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6000);
            System.out.println("Connected to server");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;

            while (true) {

                String message = keyboard.readLine();
                output.println(message);

                if ((msg = input.readLine()) != null) {
                    System.out.println("Server: " + msg);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}