Chattyczar
==========

Multi-threaded Client-Server Application

<p><i>Case 1: </i>
Simple client-server application which reads a line from the standard input and sends it to the server and then waits until it get the response from the server.
</p>

<p><i>Case 2: </i>
The client uploads a file to the server using sockets. Server reads and saves the file in server-local storage.</p>

<p><i>Case 3: </i>
Multiple peer clients interact with each other over the server.<br>
The server is unsynchronized to analyse the faults.<br>
The server is synchronized with respect to all clients, so that every client is on the same interface.<br>
Group chat room.<br></p>

HOW TO RUN:
==========
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
<p>
<i>Case 3:</i>
<ul>
  <li>Unsynchronized code: </li>
      &nbsp;&nbsp; -- src/chat/application/MultiThreadChatServer.java<br>
      &nbsp;&nbsp; -- src/chat/application/MultiThreadChatClient.java<br>
  <li>Synchronized code:</li>
      &nbsp;&nbsp; -- src/chattyczar/MultiThreadChatServer.java<br>
      &nbsp;&nbsp; -- src/chattyczar/MultiThreadChatClient.java<br>
    </ol>
</ul>
</p>


