import java.util.*;

public class ClubSystem {
    public static void main(String[] args) {
        Set<String> members = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add 2.Remove 3.Search 4.Display 5.Count 6.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    if (!members.add(name))
                        System.out.println("Already exists");
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    if (members.remove(name))
                        System.out.println("Removed");
                    else
                        System.out.println("Not found");
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    System.out.println(members.contains(name) ? "Found" : "Not found");
                    break;

                case 4:
                    System.out.println(members);
                    break;

                case 5:
                    System.out.println("Total: " + members.size());
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}