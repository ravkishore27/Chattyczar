Chattyczar
==========

Multi-threaded Client-Server Application

<i>Case 1: </i>
<p>Simple client-server application which reads a line from the standard input and sends it to the server and then waits until it get the response from the server.
</p>

<i>Case 2: </i>
<p>The client uploads a file to the server using sockets. Server reads and saves the file in server-local storage.</p>

<i>Case 3: </i>
<p>Multiple peer clients interact with each other over the server.<br>
The server is unsynchronized to analyse the faults.<br>
The server is synchronized with respect to all clients, so that every client is on the same interface.<br>
Group chat room.<br></p>

HOW TO RUN:
<ul>
  <li>Download the src files into desktop.</li>
  <li>Import the files into a eclipse project.</li>
  <li>Run the following files for each case.</li>
</ul>

<i>Case 1: </i>
  <ul>
    <li>Server.java</li>
    <li>Client.java</li>
  </ul>
  
<i>Case 2: </i>
  <ul>
    <li>EchoServer.java</li>
    <li>EchoClient.java</li>
  </ul>

<i>Case 3:</i>
<ul>
  <li>Unsynchronized code:</li>
  <ol>
    <li>src/chat/application/MultiThreadChatServer.java</li>
    <li>src/chat/application/MultiThreadChatClient.java</li>
  </ol>
  </li>  
  <li>Synchronized code:</li>
  <ol>
    <li>src/chattyczar/MultiThreadChatServer.java</li>
    <li>src/chattyczar/MultiThreadChatClient.java</li>
  </ol>
</ul>


