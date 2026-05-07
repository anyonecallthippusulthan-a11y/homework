import java.util.*;

class Employee {
    int id;
    String name;
    String dept;
    double basic;

    Employee(int id, String name, String dept, double basic) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.basic = basic;
    }

    double calculateNetSalary() {
        double hra = 0.2 * basic;
        double da = 0.1 * basic;
        double pf = 0.05 * basic;
        return basic + hra + da - pf;
    }

    void display() {
        System.out.println(id + " " + name + " " + dept + " " + basic);
    }
}

public class PayrollSystem {
    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Update 5.Net Salary 6.Delete 7.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: add(); break;
                case 2: view(); break;
                case 3: search(); break;
                case 4: update(); break;
                case 5: netSalary(); break;
                case 6: delete(); break;
                case 7: System.exit(0);
                default: System.out.println("Invalid");
            }
        }
    }

    static void add() {
        System.out.print("ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.println("ID already exists");
                return;
            }
        }

        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Dept: ");
        String dept = sc.nextLine();

        System.out.print("Salary: ");
        double sal = sc.nextDouble();

        list.add(new Employee(id, name, dept, sal));
    }

    static void view() {
        for (Employee e : list) {
            e.display();
        }
    }

    static void search() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                e.display();
                return;
            }
        }
        System.out.println("Not found");
    }

    static void update() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.print("New Salary: ");
                e.basic = sc.nextDouble();
                return;
            }
        }
        System.out.println("Not found");
    }

    static void netSalary() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.println("Net Salary: " + e.calculateNetSalary());
                return;
            }
        }
        System.out.println("Not found");
    }

    static void delete() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().id == id) {
                it.remove();
                System.out.println("Deleted");
                return;
            }
        }
        System.out.println("Not found");
    }
}