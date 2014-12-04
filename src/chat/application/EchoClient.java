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
import java.net.* ;  // header file
import java.io.* ; 

public class EchoClient {

    public static void main(String[] args) {
             //for(int i=0;i<args.length;i++)
             //{
	     
              try {
//                  if (args.length == 0)
//                  {
//                      System.out.println("File name is not given");
//                      System.exit(1);
//                  }

             Socket echoSocket = new Socket("localhost", 7777);
           
             DataOutputStream  os = new DataOutputStream(echoSocket.getOutputStream());
             
             BufferedReader is = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()) );
             BufferedReader stdIn = null ; 
             FileInputStream fl = null;
             
             
             System.out.println("FILE TO UPLOAD ");
             File file = new File ("/Users/AakarshReddy/Documents/Client/hi.rtf");
              System.out.println(" path done ");
             if (file.exists())
             {
               fl=new FileInputStream(file);
               stdIn = new BufferedReader(new InputStreamReader(fl));
               String userInput;
               os.writeUTF("fileGGGG");
               while ((userInput = stdIn.readLine()) != null) 
                {
                 os.writeBytes(userInput);
                 os.writeByte('\n');
                }
              System.out.println("echo:File Created  " + is.readLine());
            }
            else
             System.out.println(" The File "+ file + " not found  ");

                os.close();
                is.close();
                echoSocket.close();
        
              }
        catch (UnknownHostException e) 
        {
	  System.err.println("Don't know about localhost" + e);
        } 
        catch (IOException e) 
        {
	  System.err.println("Couldn't get I/O for the connection" + e);
        }
        //}  
    }
}

