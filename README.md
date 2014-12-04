Chattyczar
==========

Multi-threaded Client-Server Application

Case 1 : 
Simple client-server application which reads a line from the standard input and sends it to the server and then waits until it get the response from the server.

Case 2 :
The client uploads a file to the server using sockets. Server reads and saves the file in server-local storage.

Case 3 : 
Multiple peer clients interact with each other over the server.
The server is unsynchronized to analyse the faults.
The server is synchronized with respect to all clients, so that every client is on the same interface.
Group chat room.

HOW TO RUN:

Download the src files into desktop.

Import the files into a eclipse project.

Run the following files for each case.

Case 1: 
  Server.java
  Client.java
  
Case 2 : 
  EchoServer.java
  EchoClient.java
  
Case 3:
  Unsynchronized code:
    src/chat/application/MultiThreadChatServer.java
    src/chat/application/MultiThreadChatClient.java
  Synchronized code:
    src/chattyczar/MultiThreadChatServer.java
    src/chattyczar/MultiThreadChatClient.java



