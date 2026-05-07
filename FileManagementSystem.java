import java.io.*;
import java.util.Scanner;

public class FileManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== FILE MANAGEMENT SYSTEM =====");
            System.out.println("1. Write Data");
            System.out.println("2. Read Data");
            System.out.println("3. Append Data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    try {
                        FileWriter fw = new FileWriter("student.txt");

                        System.out.print("Enter data: ");
                        String data = sc.nextLine();

                        fw.write(data);
                        fw.close();

                        System.out.println("Data written successfully.");

                    } catch (IOException e) {
                        System.out.println("Error writing file.");
                    }
                    break;

                case 2:
                    try {
                        File file = new File("E:\\file\\student.txt");

                        if (!file.exists()) {
                            System.out.println("File does not exist.");
                            break;
                        }

                        FileReader fr = new FileReader(file);
                        int ch;

                        System.out.println("\nFile Content:");
                        while ((ch = fr.read()) != -1) {
                            System.out.print((char) ch);
                        }

                        fr.close();

                    } catch (IOException e) {
                        System.out.println("Error reading file.");
                    }
                    break;

                case 3:
                    try {
                        FileWriter fw = new FileWriter("student.txt", true);

                        System.out.print("Enter data to append: ");
                        String data = sc.nextLine();

                        fw.write("\n" + data);
                        fw.close();

                        System.out.println("Data appended successfully.");

                    } catch (IOException e) {
                        System.out.println("Error appending file.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}