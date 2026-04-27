import java.util.*;

class Student {
    int roll;
    String name;
    int age;
    String course;
    double marks;

    Student(int roll, String name, int age, String course, double marks) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }
}

public class StudentSystem {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Update 5.Delete 6.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> add();
                case 2 -> view();
                case 3 -> search();
                case 4 -> update();
                case 5 -> delete();
                case 6 -> System.exit(0);
            }
        }
    }

    static void add() {
        System.out.print("Roll: ");
        int roll = sc.nextInt();

        for (Student s : list) {
            if (s.roll == roll) {
                System.out.println("Roll already exists!");
                return;
            }
        }

        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();
        System.out.print("Marks: ");
        double marks = sc.nextDouble();

        list.add(new Student(roll, name, age, course, marks));
        System.out.println("Student Added!");
    }

    static void view() {
        for (Student s : list) {
            System.out.println(s.roll + " " + s.name + " " + s.marks);
        }
    }

    static void search() {
        System.out.print("Enter roll: ");
        int roll = sc.nextInt();

        for (Student s : list) {
            if (s.roll == roll) {
                System.out.println(s.name + " " + s.marks);
                return;
            }
        }
        System.out.println("Not found");
    }

    static void update() {
        System.out.print("Enter roll: ");
        int roll = sc.nextInt();

        for (Student s : list) {
            if (s.roll == roll) {
                System.out.print("New marks: ");
                s.marks = sc.nextDouble();
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Not found");
    }

    static void delete() {
        System.out.print("Enter roll: ");
        int roll = sc.nextInt();

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().roll == roll) {
                it.remove();
                System.out.println("Deleted!");
                return;
            }
        }
        System.out.println("Not found");
    }
}