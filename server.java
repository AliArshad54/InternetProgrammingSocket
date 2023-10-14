package myWork;
import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
           
            ServerSocket serverSocket = new ServerSocket(1234);

            System.out.println("Server is listening on port 1234...");

            while (true) {
                
                Socket clientSocket = serverSocket.accept();

                
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String message = in.readLine();

                if (message != null && message.equals("Hello My name is Ali")) {
                   
                    out.println("Walikum Salam Ali");
                } else {
                    out.println("Invalid message. Please say: 'Hello My name is Ali'");
                }

                // Close the streams and the socket
                in.close();
                out.close();
                clientSocket.close();
            }
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}
