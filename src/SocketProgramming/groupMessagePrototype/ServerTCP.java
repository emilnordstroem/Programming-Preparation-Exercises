package SocketProgramming.groupMessagePrototype;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class ServerTCP {
    private static final HashMap<Socket, DataOutputStream> clientSockets = new HashMap<>();

    public static void main(String[] args) {
        try (ServerSocket welcomeSocket = new ServerSocket(10_000)) {
            while(true){
                // Establish connection
                Socket connectionSocket = welcomeSocket.accept();
                DataOutputStream outputStream = new DataOutputStream(
                        connectionSocket.getOutputStream()
                );
                System.out.println("[client connected to Server from IP: " + connectionSocket.getInetAddress() + "]");
                clientSockets.put(connectionSocket, outputStream);

                BufferedReader inFromClient = new BufferedReader(
                        new InputStreamReader(
                                connectionSocket.getInputStream()
                        )
                );

                Thread readThread = new Thread(() -> readFromClient(inFromClient));

                readThread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFromClient(BufferedReader inFromClient){
        while (true) {
            try {
                String messageFromClient = inFromClient.readLine();
                System.out.println("received: " + messageFromClient);
                writeToClients(messageFromClient);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void writeToClients(String messageFromClient){
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
