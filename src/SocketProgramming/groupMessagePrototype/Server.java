package SocketProgramming.groupMessagePrototype;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server extends Thread {
    private final ServerSocket welcomeSocket;
    private final HashMap<Socket, DataOutputStream> clientSockets;

    public Server(int port) {
        try {
            this.welcomeSocket = new ServerSocket(port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.clientSockets = new HashMap<>();
    }

    @Override
    public void run() {
        while(true){
            try {
                Socket connectionSocket = welcomeSocket.accept();

                enableDataOutputFromClient(connectionSocket);

                Thread readThread = new Thread(() -> readFromClient(connectionSocket));
                readThread.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void enableDataOutputFromClient(Socket connectionSocket) {
        try {
            DataOutputStream outputStream = new DataOutputStream(
                    connectionSocket.getOutputStream()
            );
            System.out.println("[client connected to Server from IP: " + connectionSocket.getInetAddress() + "]");
            clientSockets.put(connectionSocket, outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void removeClient(){

    }

    private void readFromClient(Socket connectionSocket){
        while (true) {
            try {
                BufferedReader inFromClient = new BufferedReader(
                        new InputStreamReader(
                                connectionSocket.getInputStream()
                        )
                );
                String messageFromClient = inFromClient.readLine();
                System.out.println("received from client: " + messageFromClient);
                if (messageFromClient.toLowerCase().contains("disconnect")) {
                    clientSockets.remove(connectionSocket);
                    messageFromClient = "[" + connectionSocket.getInetAddress() + " has left the server]";
                }
                writeToClients(messageFromClient);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void writeToClients(String messageFromClient){
        String messageToClients = messageFromClient.trim();
        clientSockets.forEach((socket, outputStream) -> {
            try {
                System.out.println("message send by: " + socket.getInetAddress());
                outputStream.writeBytes(messageToClients + '\n');
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
