package SocketProgramming.groupMessagePrototype;

public class App {

    public static void main(String[] args) {

        Server mainServer = new Server(10_000);
        Client client = new Client("localhost", 10_000);
        Client client1 = new Client("localhost", 10_000);

        mainServer.start();
        client.start();
        client1.start();

    }

}
