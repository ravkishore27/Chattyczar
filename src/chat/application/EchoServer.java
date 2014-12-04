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



import java.net.*;
import java.io.*;

public class EchoServer {
      
    public static void main(String[] args) throws IOException{
        
       ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("Server Socket Created");
        
            //Socket clientSocket = null;
        
            
            
            System.out.println("!!!! Waiting to listen !!!!");
            while(true)
            {

                try {
             Socket connection = serverSocket.accept();
             
           

            BufferedReader is = new BufferedReader(new InputStreamReader( connection.getInputStream() ));                                 
            PrintWriter    os = new PrintWriter(new BufferedOutputStream(connection.getOutputStream(), 1024), false);
            String inputLine, filename;
            
             InputStream in = connection.getInputStream(); 
             
            DataInputStream clientData = new DataInputStream(in); 

            // Reading the file name
            filename=clientData.readUTF();
            System.out.println("Input file [" + filename + "] come in");
            filename = filename+"-out45" +".rtf"; // creating a output file
            filename = "/Users/AakarshReddy/Documents/Server/"+filename;
            // sending the outfile name to client 
             Writer out2 = new BufferedWriter(new FileWriter(filename));
             os.println(filename);
             os.flush();
             byte[] contentInBytes ;
            
             
            // writing the conents file into output file
            while ((inputLine = is.readLine()) != null) {
            
            
            out2.write(inputLine);
            out2.flush();
           
             
            
           }
          
       os.close();
            
        } 
            

                 catch (IOException e)
        {
            System.out.println("Accept failed: " + "7777, " + e);
            System.exit(1);
        }
        
            }
            
          
        } 
        
      
       catch (IOException e)
        {
            System.out.println("Could not listen on port: " + 7777 + ", " + e);
            System.exit(1);
        }
        
        }
    }





