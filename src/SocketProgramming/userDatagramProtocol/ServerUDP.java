package SocketProgramming.userDatagramProtocol;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;

public class ServerUDP {

    public static void main(String[] args) throws IOException {

        DatagramSocket serverSocket = new DatagramSocket(6789);
        String responseMessage = "Message was received";

        while (true) {
            byte[] receiveData = new byte[1024];
            DatagramPacket receivedDataPacket = new DatagramPacket(
                    receiveData,
                    receiveData.length
            );
            serverSocket.receive(receivedDataPacket);

            System.out.println(
                    new String(receivedDataPacket.getData()).trim()
            );

            byte[] sendData = new byte[1024];
            sendData = responseMessage.getBytes();
            InetAddress ipAddress = receivedDataPacket.getAddress();
            int port = receivedDataPacket.getPort();

            DatagramPacket sendDataPacket = new DatagramPacket(
                    sendData,
                    sendData.length,
                    ipAddress,
                    port
            );
            serverSocket.send(sendDataPacket);
        }

    }

}
