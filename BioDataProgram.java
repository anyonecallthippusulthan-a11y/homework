import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioDataProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw = new FileWriter("E:\\file\\biodata.txt");

            System.out.println("Enter Bio Data Details");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            String age = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("DOB: ");
            String dob = sc.nextLine();

            System.out.print("Blood Group: ");
            String blood = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("College Name: ");
            String college = sc.nextLine();

            System.out.print("CGPA: ");
            String cgpa = sc.nextLine();

            System.out.print("Skills: ");
            String skills = sc.nextLine();

            System.out.print("Experience: ");
            String experience = sc.nextLine();

            System.out.print("Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Email ID: ");
            String email = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Father Name: ");
            String father = sc.nextLine();

            System.out.print("Mother Name: ");
            String mother = sc.nextLine();

            fw.write("=========== BIO DATA ===========\n");

            fw.write("\n Personal Details\n");
            fw.write("Name : " + name + "\n");
            fw.write("Age : " + age + "\n");
            fw.write("Gender : " + gender + "\n");
            fw.write("DOB : " + dob + "\n");
            fw.write("Blood Group : " + blood + "\n");

            fw.write("\n Education\n");
            fw.write("Qualification : " + qualification + "\n");
            fw.write("College : " + college + "\n");
            fw.write("CGPA : " + cgpa + "\n");

            fw.write("\n Skills\n");
            fw.write(skills + "\n");

            fw.write("\nExperience : " + experience + "\n");

            fw.write("\n Contact\n");
            fw.write("Phone : " + phone + "\n");
            fw.write("Email : " + email + "\n");
            fw.write("Address : " + address + "\n");

            fw.write("\n Family\n");
            fw.write("Father Name : " + father + "\n");
            fw.write("Mother Name : " + mother + "\n");

            fw.write("\n================================");

            fw.close();

            System.out.println("Bio Data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

        sc.close();
    }
}