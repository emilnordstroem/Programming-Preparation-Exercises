package CompositePattern;

import CompositePattern.FileSystem.Client;

public class Main {

    public static void main(String[] args) {
        Client user = new Client("EmilNordstroem");
        user.printFileSystem();
        user.createNewFolder("user", "Avanceret Programmering");
        user.printFileSystem();
        user.createNewFile("Avanceret Programmering", "Noter", "Dette er mine noter");
    }

}
