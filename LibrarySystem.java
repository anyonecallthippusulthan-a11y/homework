import java.util.*;

class Book {
    int id;
    String title, author;
    String status;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }
}

public class LibrarySystem {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Issue 5.Return 6.Delete 7.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> add();
                case 2 -> view();
                case 3 -> search();
                case 4 -> issue();
                case 5 -> returnBook();
                case 6 -> delete();
                case 7 -> System.exit(0);
            }
        }
    }

    static void add() {
        System.out.print("Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                System.out.println("ID exists!");
                return;
            }
        }

        sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book Added!");
    }

    static void view() {
        for (Book b : books) {
            System.out.println(b.id + " " + b.title + " " + b.status);
        }
    }

    static Book find(int id) {
        for (Book b : books) {
            if (b.id == id) return b;
        }
        return null;
    }

    static void search() {
        System.out.print("Enter ID: ");
        Book b = find(sc.nextInt());

        if (b != null)
            System.out.println(b.title + " " + b.status);
        else
            System.out.println("Not found");
    }

    static void issue() {
        System.out.print("Enter ID: ");
        Book b = find(sc.nextInt());

        if (b == null) {
            System.out.println("Not found");
        } else if (b.status.equals("Issued")) {
            System.out.println("Already issued!");
        } else {
            b.status = "Issued";
            System.out.println("Issued!");
        }
    }

    static void returnBook() {
        System.out.print("Enter ID: ");
        Book b = find(sc.nextInt());

        if (b == null) {
            System.out.println("Not found");
        } else if (b.status.equals("Available")) {
            System.out.println("Already available!");
        } else {
            b.status = "Available";
            System.out.println("Returned!");
        }
    }

    static void delete() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        books.removeIf(b -> b.id == id);
        System.out.println("Deleted (if existed)");
    }
}