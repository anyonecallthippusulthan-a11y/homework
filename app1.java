import java.util.Scanner;

class app {
    int bookid;
    String title;
    String author;
    boolean available;

    Scanner sc = new Scanner(System.in);

    // Constructor
    app(int bookid, String title, String author) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    void display() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book already borrowed");
        }
    }

    void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned");
        } else {
            System.out.println("Book already available");
        }
    }

    void menu() {
        int option;

        do {
            System.out.println("\n1. Display");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    display();
                    break;

                case 2:
                    borrow();
                    break;

                case 3:
                    returnBook();
                    break;

                case 4:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option != 4);
    }

    public static void main(String[] args) {
		boolean hi=true;
		do{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        app book = new app(id, title, author);
        book.menu();
		
		}while (hi=false);
    }
}