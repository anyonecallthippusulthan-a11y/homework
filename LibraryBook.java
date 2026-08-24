import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Book ID -> Book Title
        Map<Integer, String> books = new HashMap<>();

        while (true) {

            System.out.println("\n===== LIBRARY BOOK MANAGEMENT =====");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Update Book Details");
            System.out.println("4. Remove Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            // 1. Add Book
            if (choice == 1) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                books.put(id, title);

                System.out.println("Book added successfully!");
            }

            // 2. Search Book
            else if (choice == 2) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                if (books.containsKey(id)) {

                    System.out.println("Book ID: " + id);
                    System.out.println("Book Title: " + books.get(id));

                } else {

                    System.out.println("Book not found!");
                }
            }

            // 3. Update Book Details
            else if (choice == 3) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                if (books.containsKey(id)) {

                    System.out.print("Enter New Book Title: ");
                    String title = sc.nextLine();

                    books.put(id, title);

                    System.out.println("Book details updated successfully!");

                } else {

                    System.out.println("Book not found!");
                }
            }

            // 4. Remove Book
            else if (choice == 4) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                if (books.containsKey(id)) {

                    books.remove(id);

                    System.out.println("Book removed successfully!");

                } else {

                    System.out.println("Book not found!");
                }
            }

            // 5. Display All Books
            else if (choice == 5) {

                if (books.isEmpty()) {

                    System.out.println("No books available!");

                } else {

                    System.out.println("\n--- All Books ---");

                    for (Map.Entry<Integer, String> entry : books.entrySet()) {

                        System.out.println(
                            "Book ID: " + entry.getKey()
                            + " | Book Title: " + entry.getValue()
                        );
                    }
                }
            }

            // 6. Exit
            else if (choice == 6) {

                System.out.println("Program ended.");
                break;

            }

            else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}