package myWork;
import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 1234);

           
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            
            out.println("Hello My name is Ali");

            
            String response = in.readLine();
            System.out.println("Server says: " + response);

            out.close();
            in.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
