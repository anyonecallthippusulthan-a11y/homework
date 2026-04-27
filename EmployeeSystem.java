import java.util.*;

class Employee {
    int id;
    String name, dept;
    double basic;

    Employee(int id, String name, String dept, double basic) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.basic = basic;
    }

    double netSalary() {
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.05;
        return basic + hra + da - pf;
    }
}

public class EmployeeSystem {
    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Update 5.Net Salary 6.Delete 7.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> add();
                case 2 -> view();
                case 3 -> search();
                case 4 -> update();
                case 5 -> salary();
                case 6 -> delete();
                case 7 -> System.exit(0);
            }
        }
    }

    static void add() {
        System.out.print("ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.println("ID exists!");
                return;
            }
        }

        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Dept: ");
        String dept = sc.nextLine();
        System.out.print("Basic Salary: ");
        double basic = sc.nextDouble();

        list.add(new Employee(id, name, dept, basic));
        System.out.println("Added!");
    }

    static Employee find(int id) {
        for (Employee e : list) {
            if (e.id == id) return e;
        }
        return null;
    }

    static void view() {
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.basic);
        }
    }

    static void search() {
        System.out.print("Enter ID: ");
        Employee e = find(sc.nextInt());

        if (e != null)
            System.out.println(e.name + " " + e.basic);
        else
            System.out.println("Not found");
    }

    static void update() {
        System.out.print("Enter ID: ");
        Employee e = find(sc.nextInt());

        if (e != null) {
            System.out.print("New Salary: ");
            e.basic = sc.nextDouble();
            System.out.println("Updated!");
        } else {
            System.out.println("Not found");
        }
    }

    static void salary() {
        System.out.print("Enter ID: ");
        Employee e = find(sc.nextInt());

        if (e != null)
            System.out.println("Net Salary: " + e.netSalary());
        else
            System.out.println("Not found");
    }

    static void delete() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        list.removeIf(e -> e.id == id);
        System.out.println("Deleted (if existed)");
    }
}