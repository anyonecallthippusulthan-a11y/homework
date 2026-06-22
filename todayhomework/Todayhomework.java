package todayhomework;

import java.util.Scanner;

public class Todayhomework {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        while (true) {

            try {

                System.out.println("\n===== MENU =====");
                System.out.println("1.Insert Student");
                System.out.println("2.View All Students");
                System.out.println("3.Update Student By ID");
                System.out.println("4.Delete Student By ID");
                System.out.println("5.Search Student By Email");
                System.out.println("6.Exit");

                System.out.print("Enter Choice : ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("ID : ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name : ");
                        String name = sc.nextLine();

                        System.out.print("Email : ");
                        String email = sc.nextLine();

                        System.out.print("Course : ");
                        String course = sc.nextLine();

                        System.out.print("Fee : ");
                        double fee = sc.nextDouble();

                        Studentm s
                                = new Studentm(id, name, email, course, fee);

                        dao.insertStudent(s);

                        break;

                    case 2:

                        dao.viewAllStudents();
                        break;

                    case 3:

                        System.out.print("Enter ID : ");
                        id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("New Course : ");
                        String newCourse = sc.nextLine();

                        System.out.print("New Fee : ");
                        double newFee = sc.nextDouble();

                        dao.updateStudent(id, newCourse, newFee);
                        break;

                    case 4:

                        System.out.print("Enter ID : ");
                        int deleteId = sc.nextInt();

                        dao.deleteStudent(deleteId);
                        break;

                    case 5:

                        sc.nextLine();

                        System.out.print("Enter Email : ");
                        String searchEmail = sc.nextLine();

                        dao.searchByEmail(searchEmail);
                        break;

                    case 6:

                        System.out.println("Thank You");
                        System.exit(0);

                    default:

                        System.out.println("Invalid Choice");
                }

            } catch (Exception e) {

                System.out.println("Error : " + e.getMessage());
            }
        }
    }
}
