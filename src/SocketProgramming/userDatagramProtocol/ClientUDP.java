package SocketProgramming.userDatagramProtocol;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {

    public static void main(String[] args) throws IOException {
        byte[] sendData = new byte[1024];
        String sentence = "Hello, World!.. I mean 'Hello, Server!'";
        sendData = sentence.getBytes();

        InetAddress serverIP = InetAddress.getByName("localhost");
        int serverPort = 6789;

        DatagramPacket sendDataPacket = new DatagramPacket(
                sendData,
                sendData.length,
                serverIP,
                serverPort
        );

        DatagramSocket clientSocket = new DatagramSocket();
        clientSocket.send(sendDataPacket);


        byte[] receiveData = new byte[1024];
        DatagramPacket receivedDataPacket = new DatagramPacket(
                receiveData,
                receiveData.length
        );
        clientSocket.receive(receivedDataPacket);

        System.out.println(
                new String(receivedDataPacket.getData()).trim()
        );
        clientSocket.close();
    }

}
