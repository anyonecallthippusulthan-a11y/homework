
package studentmain;

import java.sql.SQLException;
import java.util.Scanner;


public class Studentmain {

  



    public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {

        Scanner sc = new Scanner(System.in);
                Scanner se = new Scanner(System.in);


        studentdao si = new studentdao();

        while(true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1.Insert Student");
            System.out.println("2.View All Students");
            System.out.println("3.Update Student By ID");
            System.out.println("4.Delete Student By ID");
            System.out.println("5.Search Student By Email");
            System.out.println("6.Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch(choice) {

            case 1:

                System.out.print("id : ");
                int id = se.nextInt();


                System.out.print("Name : ");
                String name = sc.nextLine();

                System.out.print("Email : ");
                String email = sc.nextLine();

                System.out.print("Course : ");
                String course = sc.nextLine();

                System.out.print("Fee : ");
                double fee = sc.nextDouble();

                Studentmodule s=new Studentmodule(id, name, course, email, choice);

                si.insert(s);

                break;

            case 2:

                si.display();

                break;

            case 3:

                System.out.print("Enter ID : ");
                int sid =sc.nextInt();

                  System.out.print("New Course : ");
                String c = sc.nextLine();

                System.out.print("New Fee : ");
                double f = sc.nextDouble();

                si.update(s);

                break;

            case 4:

                System.out.print("Enter ID : ");
                int did = sc.nextInt();

                si.delete(s);

                break;

            case 5:

                sc.nextLine();

                System.out.print("Enter Email : ");
                String em = sc.nextLine();

                si.search(s);

                break;

            case 6:

                System.out.println("Thank You");
                System.exit(0);

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}
           
       

  
