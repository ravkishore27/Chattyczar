/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chat.application;

/**
 *
 * @author Ganesh
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
//import java.string;

public class Server {
  public static void main(String args[]) {

    ServerSocket echoServer = null;
    String line;
    DataInputStream is;
    PrintStream os;
    Socket clientSocket = null;
    DataInputStream inputLine = null;

    /*
     * Open a server socket on port 2222. Note that we can't choose a port less
     * than 1023 if we are not privileged users (root).
     */
    try {
      echoServer = new ServerSocket(2222);
    } catch (IOException e) {
      System.out.println(e);
    }

    /*
     * Create a socket object from the ServerSocket to listen to and accept
     * connections. Open input and output streams.
     */
    System.out.println("The server started. To stop it press ok.");
    try {
      clientSocket = echoServer.accept();
      is = new DataInputStream(clientSocket.getInputStream());
      os = new PrintStream(clientSocket.getOutputStream());
      inputLine = new DataInputStream(new BufferedInputStream(System.in));
      /* As long as we receive data, echo that data back to the client. */
      while (true) {
        line = is.readLine();
        //os.println("From server: " + line);
        if (line.startsWith("ok")) {
          break;
        }
        System.out.println("Clients responding : " + line);
        os.println("From server: " + inputLine.readLine());
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }

    private static void print(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
