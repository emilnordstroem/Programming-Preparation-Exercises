package SocketProgramming.groupMessagePrototype;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    private final Socket clientSocket;
    private final DataOutputStream outToServer;
    private final BufferedReader inFromServer;

    public Client(String ipAddress, int port) {
        try {
            this.clientSocket = new Socket(ipAddress, port);
            this.outToServer = new DataOutputStream(
                    clientSocket.getOutputStream()
            );
            this.inFromServer = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()
                    )
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        Thread writeThread = new Thread(() -> writeToServer());
        Thread readThread = new Thread(() -> readFromServer());

        writeThread.start();
        readThread.start();
    }

    private void writeToServer(){
        Scanner messageScanner = new Scanner(System.in);
        String messageToServer;
        while (true) {
            try {
                messageToServer = messageScanner.nextLine();
                outToServer.writeBytes(messageToServer + '\n');
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void readFromServer(){
        String messageFromServer;
        while (true) {
            try {
                messageFromServer = inFromServer.readLine();
                System.out.println("received by server: " + messageFromServer);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}