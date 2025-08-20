package FileInputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Emil Nordstrøm\\IdeaProjects\\ComputerScience(AP)\\ProgrammingPrepExercises\\src\\FileInputOutput\\File.txt");
        if (file.exists()) {
            System.out.println("file exists");
            System.exit(1);
        }
        System.out.println("Input to file:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.append(input);
        fileWriter.close();

        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            System.out.println(fileScanner.nextLine());
        }

    }

}
