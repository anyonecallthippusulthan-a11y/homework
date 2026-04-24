package javaapplication53;

import java.util.Scanner;


public class JavaApplication53 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        Institution.Student in= new Institution(). new Student();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    in.addStudent();
                    

                case 2:
                    in.addMarks();
                    break;

                case 3:
                    in.cal();
                    break;

                case 4:
                    in.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
      
    
