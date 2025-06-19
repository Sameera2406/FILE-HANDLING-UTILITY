import java.io.*;
import java.util.Scanner;

public class FileHandling{

    File obj=new File("file.txt");

    // Write to the file 
    public static void writeToFile(Scanner scanner) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            System.out.println("Enter text to write:");

            while (true) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                writer.write(line);
                writer.newLine();
            }
              writer.close();
            System.out.println("File written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read from the file 
    public static void readFromFile() {
        try {
            FileReader reader = new FileReader("file.txt");
            int ch;
            System.out.println("File content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    // Modify the file 
    public static void modifyFile(String target, String replacement) {
        try {
            FileReader reader = new FileReader("file.txt");
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }
            reader.close();

            String modifiedContent = content.toString().replace(target, replacement);

            FileWriter writer = new FileWriter("file.txt");
            writer.write(modifiedContent);
            writer.close();

            System.out.println("File modified successfully.");

        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- File Handler Menu ---");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Modify File Content");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    writeToFile(input); 
                    break;
                case 2:
                    readFromFile();
                    break;
                case 3:
                    System.out.print("Enter word to replace: ");
                    String target = input.nextLine();
                    System.out.print("Enter replacement word: ");
                    String replacement = input.nextLine();
                    modifyFile(target, replacement);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        input.close();
    }
}
